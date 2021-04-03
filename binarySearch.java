package com.example.demo.AssignmentJava;


import java.util.*;



public class Program {
    static void binarySearch(int[] array, int start, int end, int key) {
        int middle = (start + end)/2;
        while (start <= end) {
            if (array[middle] == key) {
                System.out.println("element found at " + (middle + 1));
                break;
            }
            else if (array[middle] < key)
                start = middle + 1;
            else
                end = middle - 1;
            middle = (start + end)/2;
        }
        if (start > end) {
            System.out.println("Element Not found");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int length = input.nextInt();
        int[] array = new int[length];
        System.out.println("enter the element in sorted order");
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            array[i] = input.nextInt();
        }
        System.out.print("element to be found ");
        int key = input.nextInt();
        binarySearch(array, 0, array.length - 1, key);
    }
}
