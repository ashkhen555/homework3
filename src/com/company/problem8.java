package com.company;

import java.util.Scanner;

public class problem8 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            sum = sum + number;
            count = count + 1;
        }
        System.out.println(sum);
        System.out.println(sum / count);
    }
}

