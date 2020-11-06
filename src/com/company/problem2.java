package com.company;

public class problem2 {

    public static void main(String[] args) {
        int number = 1;
        while (number % 1 == 0 && number <= 20) {
            if (number % 3 != 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
//without continue