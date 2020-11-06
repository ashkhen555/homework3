package com.company;

import java.util.Scanner;

public class problem9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {

            double Cube = Math.pow(i, 3);
            //String text=String.valueOf((Cube));
            // uzum ei double tveri .0-n veracnei chstacvec
            System.out.println("Number is : " + i + " and cube of the " + i + " is : " + Cube);
        }
    }
}

