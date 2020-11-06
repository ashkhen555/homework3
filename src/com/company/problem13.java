package com.company;

import jdk.jfr.StackTrace;

import java.util.Scanner;

public class problem13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String colori;
        String colorj;

        for (int i = 1, j = 1; i <= number || j <= number; i++, j++) {
            if (i % 2 != 0) {
                if (j % 2 != 0) {colori="black";
                    System.out.println(colori);
                } else {colorj="white";
                    System.out.println(colorj);
                }
            }else {
                System.out.println("white-"+i);
            }
        }
    }
}//to be continue

