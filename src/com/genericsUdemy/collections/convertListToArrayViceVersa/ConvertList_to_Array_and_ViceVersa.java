package com.genericsUdemy.collections.convertListToArrayViceVersa;

import java.util.Arrays;
import java.util.List;

public class ConvertList_to_Array_and_ViceVersa {
    public static void main(String[] args) {
        var nums = List.of(22, 3, 4, 7, 9);
        var arr  = nums.toArray();
        System.out.println(arr[2]);

        Integer[] arrNum = {22, 4, 6, 89};
        var list = Arrays.asList(arrNum);
        System.out.println(list.get(2));
    }
}
