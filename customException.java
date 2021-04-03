package com.example.demo.AssignmentJava;


import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

class Program{

    static void validate(int age)throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter age ");
            int age = sc.nextInt();
            validate(age);
        }catch(Exception m){
            System.out.println("Exception occured: "+m);
        }

        System.out.println("run");
    }
}
