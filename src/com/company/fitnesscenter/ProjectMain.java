package com.company.fitnesscenter;

import java.util.LinkedList;

public class ProjectMain {
    public static void main(String[] args) {
        String mem;

        MembershipManagement membership = new MembershipManagement();
        FileHandler fileHandler = new FileHandler();

        LinkedList<Member> members = fileHandler.readFile();
        int choice = membership.getChoice();

        while (choice != -1) {
            switch (choice) {
                case 1:
                    mem = membership.addMembers(members);
                    fileHandler.appendFile(mem);
                    break;
                case 2:
                    membership.removeMember(members);
                    fileHandler.overwriteFile(members);
                    break;
                case 3:
                    membership.printMemberInfo(members);
                    break;
                default:
                    System.out.println("\nYuo have selected an invalid option. \n\n");
                    break;
            }
            choice = membership.getChoice();
        }
        System.out.println("\nGood Bye");
    }
}
