package com.company.fitnesscenter;

import java.io.*;
import java.util.LinkedList;

public class FileHandler {

    public LinkedList<Member> readFile() {
        LinkedList<Member> membersList = new LinkedList<>();
        String lineRead;
        String[] splitLine;
        Member member;
        InputStream in;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("members.csv"))) {
            lineRead = bufferedReader.readLine();
            while (lineRead != null) {
                splitLine = lineRead.split(", ");
                if (splitLine[0].equals("S")) {
                    member = new SingleClubMember('S', Integer.parseInt(splitLine[1]),
                            splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                } else {
                    member = new MultiClubMember('M', Integer.parseInt(splitLine[1]),
                            splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                }
                membersList.add(member);
                lineRead = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return membersList;
    }
    public void appendFile(String member){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("members.temp", true))){
            writer.write(member + "\n");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public void overwriteFile(LinkedList<Member> membersList){
        String s;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("members.temp", false))){
            for (Member member : membersList) {
                s = member.toString();
                writer.write(s + "\n");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }try{
            File file = new File("members.csv");
            File tempFile = new File("members.temp");
            file.delete();
            tempFile.renameTo(file);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
