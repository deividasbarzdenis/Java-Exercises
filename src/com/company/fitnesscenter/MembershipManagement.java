package com.company.fitnesscenter;

import com.sun.security.jgss.GSSUtil;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {
    final private Scanner reader = new Scanner(System.in);

    public int getChoice(){
        int choice;
        System.out.println("\nWELCOME TO OZONE FITNESS CENTER");
        System.out.println("================================");
        System.out.println("\n1) Add Member\n" +
                "2) Remove Member\n"+
                "3) Display Member Information");
        System.out.println("\nPlease enter an option or enter -1 to quit");
        choice = getIntInput();
        return choice;
    }
    public String addMembers(LinkedList<Member> memberList){
        String name;
        int club;
        String mem = null;
        double fees;
        int memberID;
        Member member;
        Calculator<Integer> cal;

        System.out.println("\nPlease enter the member's name:");
        name = reader.nextLine();

        printClubOptions();
        System.out.println("\nPlease enter the member's clubID: ");
        club = getIntInput();

        while(club < 1 || club > 4){
            System.out.println("\nInvalid Club ID. Please try again: ");
            club = getIntInput();
        }
        if(memberList.size() > 0){
            memberID = memberList.getLast().getMemberID() + 1;
        }else{
            memberID = 1;
        }

        if(club != 4 ){
            cal = (n) -> {
                switch(n){
                    case 1:
                        return 900;
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                    default:
                        return -1;
                }
            };
            fees = cal.calculateFees(club);
            member = new SingleClubMember('S', memberID, name, fees, club);
            memberList.add(member);
            mem = member.toString();
            System.out.println("\nSTATUS: Single Club Member added\n");
        }

        return mem;
    }
    public void removeMember(LinkedList<Member> memberList){
        int memberID;
        System.out.println("\nEnter Member ID to remove: ");
        memberID = getIntInput();
        for(int i = 0; i< memberList.size(); i++){
            if(memberList.get(i).getMemberID() == memberID){
                memberList.remove(i);
                System.out.println("\nMember Removed");
                return;
            }
        }
        System.out.println("\nMember ID not found\n");
    }
    public void printMemberInfo(LinkedList<Member> memberList){
        int memberID;
        System.out.println("\nEnter member ID to display information: ");
        memberID = getIntInput();

        for(int i = 0; i<memberList.size(); i++){
            if(memberList.get(i).getMemberID() == memberID){
                String[] memberInfo = memberList.get(i).toString().split(", ");

                System.out.println("\nMember Type = " + memberInfo[0]);
                System.out.println("Member ID = "+ memberInfo[1]);
                System.out.println("Member name = "+ memberInfo[2]);
                System.out.println("Membership Fees = " + memberInfo[3]);
                if(memberInfo[0].equals('S')){
                    System.out.println("Club member ID = " + memberInfo[3]);
                }else{
                    System.out.println("Membership Points: " + memberInfo[3]);
                }
                return;
            }
        }
        System.out.println("\nMember ID not found");
    }
    private int getIntInput(){
        int choice = 0;
        while(choice == 0){
            try{
                choice = reader.nextInt();
                if(choice == 0){
                    throw new InputMismatchException();
                }
                reader.nextLine();
            }catch (InputMismatchException e){
                reader.nextLine();
                System.out.println("\nEROR; INVALID INPUT. Please try again: ");
            }
        }
        return choice;
    }
    private void printClubOptions(){
        System.out.println("\n1) Club Mercury\n" +
                "2) Club Neptune\n"+
                "3) Club Jupiter\n"+
                "4) Club Multi Club");
    }
}
