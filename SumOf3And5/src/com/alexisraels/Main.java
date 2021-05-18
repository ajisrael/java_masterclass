package com.alexisraels;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i%3 == 0) && (i%5 == 0)) {
                count++;
                System.out.println(count + ": " + i);
                sum += i;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}
