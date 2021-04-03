package com.example.demo.AssignmentJava;

import java.util.Scanner;
class Program
{
    static String findGrade(int total,int totalMark)
    {
        String grade="D";
        double percentage =((double)(total)/ totalMark) * 100;
        //System.out.println(percentage+"====percentage");
        if(percentage >= 80)
        {
            return grade="A";
        }
        else if(percentage >= 60 && percentage < 80)
        {
            return grade="B";
        }
        else if(percentage >= 40 && percentage < 60)
        {
            return grade="C";
        }
        return grade;


    }
    public static void main(String args[])
    {
        System.out.println("enter the total no of sub");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] marks = new int[num];
        int total=0;
        int totalMark=num*100;

        System.out.println("enter the marks");

        for(int i=0;i<num;i++)
        {
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        String grade = findGrade(total,totalMark);
        System.out.println("Grade of the student :" + grade);
    }
}
