package com.company.fitnesscenter;

//POJO class
public class MultiClubMember extends Member{

    private int membershipsPoints;

    public MultiClubMember(char memberType, int memberID, String name, double fees, int membershipsPoints) {
        super(memberType, memberID, name, fees);
        this.membershipsPoints = membershipsPoints;
    }

    public int getMembershipsPoints() {
        return membershipsPoints;
    }

    public void setMembershipsPoints(int membershipsPoints) {
        this.membershipsPoints = membershipsPoints;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + membershipsPoints;
    }
}
