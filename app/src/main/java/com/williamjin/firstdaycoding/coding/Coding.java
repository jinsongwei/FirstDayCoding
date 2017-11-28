package com.williamjin.firstdaycoding.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by william on 11/28/17.
 */

public class Coding {
    // create a function to print the duplicates in a list of strings
    public static void printDuplicates(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String s : list) {
            if(set.contains(s))
                System.out.println(s);
            else{
                set.add(s);
            }
        }
    }

    //create function to check if the string is a palindrome
    public static boolean checkPalindrome(String s) {
        if (s == null || s.length() == 1)
            return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }

    //    Problem 3
//    Create a function that will print
//      "fizz" is the number is divisible by 3
//      "buzz" is the number is divisible by 5
//      "fizzBuzz” is the number is divisible by both
//      and the integer for the rest

    public static void printDivisible(int num){
        boolean div3 = num % 3 == 0;
        boolean div5 = num % 5 == 0;
        if(div3 && div5) {
            System.out.println("fizzBuzz");
            return;
        }
        if(div3){
            System.out.println("fizz");
            return;
        }
        if(div5){
            System.out.println("buzz");
            return;
        }
    }

    public static void main(String[] args) {
        //problem 1
        String[] duplitList = {"one", "one", "two", "three", "one"};
        List<String> list = Arrays.asList(duplitList);
        printDuplicates(list);

    }
}
