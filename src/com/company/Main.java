package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = i + j;

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
