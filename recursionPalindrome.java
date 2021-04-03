package com.example.demo.AssignmentJava;


import java.util.*;
class Program
{
    static boolean checkPalindrome(String str,int start,int end)
    {
        if(start == end) {
            return true;
        }
        if((str.charAt(start)) != (str.charAt(end))) {
            return false;
        }
        if (start < end ) {
            return checkPalindrome(str, start + 1, end - 1);
        }
        return true;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string value to check :");
        String str = sc.next();
        int n = str.length();
        if(checkPalindrome(str,0,n-1)) {
            System.out.println("Its palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }
    }
}
