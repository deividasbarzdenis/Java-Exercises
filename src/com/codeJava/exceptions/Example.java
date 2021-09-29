package com.codeJava.exceptions;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class Example {

    /*
     * If the protected code can throw different exceptions which are not in the same inheritance tree, i.e.
     * they don’t have parent-child relationship, the catch blocks can be sorted any order.
     * However, keep in mind this rule: if the exceptions have parent-child relationship, the catch blocks must be
     * sorted by the most specific exceptions first, then by the most general ones.
     * */
    public static void main(String[] args) {

    }

    /*
     * f we catch the most general exception first, then we also catch other exceptions which are subtypes of the
     * general exception. For example, the above example can be re-written to catch only the IOException which
     * is also parent of FileNotFoundException:
     * */
    public static void example() {
        try {
            LineNumberReader lineReader = new LineNumberReader(new FileReader("hello.txt"));
            String line = lineReader.readLine();
            lineReader.close();

            System.out.println(line);

        } catch (IOException ex) {
            System.err.println("Error reading file");
        }
    }

    /*
     * It’s easy to understand because Exception is the supertype of all exceptions. However, this practice is not
     * recommended, as it makes the programmers lazy: catching one is obviously quicker than catching many.
     * That means the programmers do not take responsibility to handle exceptions carefully. The good practice
     * recommends catching specific exceptions so the program can handle different situations well.
     * Java doesn’t prohibit you from catching one for all, but when doing so, you should have good reasons to do that.
     * */
    public static void doCrypto(int cipherMode, String key, File inputFile,
                                File outputFile) throws CryptoException {
        try {
            Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(cipherMode, secretKey);

            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);

            byte[] outputBytes = cipher.doFinal(inputBytes);

            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(outputBytes);

            inputStream.close();
            outputStream.close();

        } catch (Exception ex) {
            System.err.println("error");
        }
    }

    /*
     * Since Java 7, we can combine multiple exceptions in a single catch clause. This becomes very handy in case we
     * want to apply the same handling for those exceptions. For example, the above code can be re-written using
     * a multi-catch statement like this:
     * */
    public static void doCrypto1(int cipherMode, String key, File inputFile,
                                 File outputFile) throws CryptoException {
        try {
            Key secretKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(cipherMode, secretKey);

            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);

            byte[] outputBytes = cipher.doFinal(inputBytes);

            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(outputBytes);

            inputStream.close();
            outputStream.close();

        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                | InvalidKeyException | BadPaddingException
                | IllegalBlockSizeException | IOException ex) {
            System.err.println("error");
        }
    }
    /*
    * Note that we can group only un-related exceptions together. That means it’s illegal to group exceptions which
    * have parent-child relationship. For example, it’s illegal to write a multi-catch statement like this:
    *
    * try {
        LineNumberReader lineReader = new LineNumberReader(new FileReader("hello.txt"));
        String line = lineReader.readLine();
        lineReader.close();
        System.out.println(line);
        } catch (FileNotFoundException | IOException ex) {
        System.err.println("Find not found");
    }
    * */

    /*
    * It’s up to you to write anything inside the catch blocks. Remember the main purpose of the catch blocks is to
    * recover the program from the exceptions and continue execution, such as notifying the user about the error,
    * ask he or she to wait, try again or exit, etc.
    * Typically, you can do the following things in the catch blocks (not limited to):
-   * Print out the exception details via System.err class’ methods, then exit the method:
        System.err.println(ex);
        System.err.println(ex.getMessage());
    *  Print the full stack trace of the exception and exit the method:
        ex.printStackTrace();
        *
        - Log the exceptions then exit the method. You can use Java’s built-in logging functionalities or a third-part library like log4j.
        - Display an error message dialog in case the program is a desktop application (Swing or JavaFX).
        - Redirect the user to an error page in case the program is a web application (Servlets & JSP).
    * */
}
