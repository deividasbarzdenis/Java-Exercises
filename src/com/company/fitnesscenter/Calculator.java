package com.company.fitnesscenter;

public interface Calculator <T extends Number>{

    double calculateFees(T clubID);
}
