package com.siaip;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum(15));
        System.out.println(getNumberFactorial(4));
        Integer[] list = {22, 22, 22, 22};
        System.out.println(linearSearch(22, list));
        System.out.println(reverseString("java interview"));
        Integer[] list1 = {-1, 4, 2, 1};
        System.out.println(maximum(list1));
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(average(list2));
        List<String> list3 = Arrays.asList("List1", "array");
        System.out.println(upperCase(list3));
        List<Integer> list4 = Arrays.asList(0, 1);
        System.out.println(getElement(list4, 1));

        System.out.println(find(list1));

        System.out.print("1");
        System.out.print("2");
        System.out.println("3");
        System.out.println();
        System.out.println("4");
        System.out.println("Hello to starting programing course!");
    }

    public static Integer sum(Integer n) {
        int numberSum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0) {
                numberSum += i;
            } else if (i % 5 == 0) {
                numberSum += i;
            }
        }
        return numberSum;
    }

    public static Integer getNumberFactorial(Integer n) {
        int multipleNumbers = 1;
        for (int i = 1; i <= n; i++) {
            multipleNumbers *= i;
        }
        return multipleNumbers;
    }

    public static int linearSearch(Integer n, Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            if (n.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
        //One more solution:
/*        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length() - i - 1);
        }
        return result;*/
    }

    /**
     * Write a method that returns the largest integer in the list.
     * You can assume that the list has at least one element.
     */
    public static Integer maximum(Integer[] list) {
        return Arrays
                .stream(list)
                .mapToInt(n -> n)
                .max()
                .orElseThrow(NoSuchElementException::new);
        // Solution:
        /*
        int maximum = list[0];
        for (int i : list) {
            if (i > maximum) {
            maximum = i;
            }
        }
        return maximum;
        */
    }

    /**
     * Average Value (Java 8 Lambdas and Streams)
     * Write a method that returns the average of a list of integers.
     */
    public static Double average(List<Integer> list) {
        return list
                .stream()
                .mapToDouble(d -> d)
                .average()
                .orElseThrow(NoSuchElementException::new);
        /*
        * return list.stream()
                    .mapToInt(i -> i)
                    .average()
                    .getAsDouble();
        * */
    }

    /**
     * Convert to Upper Case (Java 8 Lambdas and Streams)
     * Write a method that converts all strings in a list to their upper case.
     */
    public static List<String> upperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    /**
     * Nth Odd Element
     * Write a method that returns the nth odd element of a list. If the index
     * of the element exceeds the list size, then return -1.
     */
    public static Integer getElement(List<Integer> list, Integer n) {
        int elementIndex = 2 * (n - 1);
        return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);
    }
    /**
     * Number Of Tree Nodes
     * Write a method that returns the number of nodes in a binary tree.
     * TreeNode API methods: node.left() and node.right().
     * */
 /*   public Integer getNumberOfNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + getNumberOfNodes(node.left()) + getNumberOfNodes(node.right());
    }*/

    /**
     * Count Nodes in List
     * Count the number of nodes in a list.
     * ListNode API methods: node.next().
     * */
/*    public Integer count(ListNode node) {
        int count = 0;
        ListNode current = node;
        while (current != null) {
            count++;
            current = current.next();
        }
        return count;

    }*/

    /**
     * Count Number of Leaf Nodes
     * Count the number of leaf nodes in a binary tree
     * */
/*    public Integer countLeafNodes(TreeNode node){
        if (node == null) {
            return 0;
        }
        if (node.left() == null && node.right() == null) {
            return 1;
        }
        return countLeafNodes(node.left()) + countLeafNodes(node.right());
    }*/

    /**
     * Binary Tree Depth
     * Write a method that returns the maximum depth of a binary tree.
     * The maximum depth is the number of nodes from the root (inclusive) until the furthest node (inclusive).
     * */
 /*   public Integer depthBinaryTree(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(depthBinaryTree(node.right()), depthBinaryTree(node.left()));
    }*/

    /**
     * Find Second Largest Number in Array
     * Find the second largest number in an integer array. You can assume a minimum array length of two.
     */
    public static Integer find(Integer[] arr) {
        int firstMax = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            }

            if (arr[i] < firstMax && arr[i] > secondMax) {
                secondMax = arr[i];

            }
        }
        return secondMax;
    }
}
