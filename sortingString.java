package com.example.demo.AssignmentJava;


import java.util.*;
import java.util.Arrays;

public class Program
{
    public static String sortString(String inputString)
    {
        char arr[] = inputString.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the string to be sorted");
        String inputString = sc.nextLine();
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + outputString);
    }
}
