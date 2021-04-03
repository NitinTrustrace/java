package com.example.demo.AssignmentJava;


import java.util.*;
class Coffee {
    boolean stateBoolean = false;
    synchronized void getCoffee() {
        while (!stateBoolean) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
        System.out.println("Coffee Collected");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        System.out.println("Coffee Consumed");
        stateBoolean = false;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        notify();
    }
    synchronized void makeCoffee() {
        while (stateBoolean) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught");
            }
        }
        stateBoolean = true;
        System.out.println("Coffee Produced");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Exception caught");
        }
        notify();
    }
}

class CoffeeMaker implements Runnable {
    Coffee coffee;
    CoffeeMaker(Coffee coffee) {
        this.coffee = coffee;
        new Thread(this, "CoffeeMachine").start();
    }
    public void run() {
        while(true) {
            coffee.makeCoffee();
        }
    }
}

class Waiting implements Runnable {
    Coffee coffee;
    Waiting(Coffee coffee) {
        this.coffee = coffee;
        new Thread(this, "Waiter").start();
    }
    public void run() {
        while(true) {
            coffee.getCoffee();
        }
    }
}
class Program {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        new CoffeeMaker(coffee);
        new Waiting(coffee);
    }
}

