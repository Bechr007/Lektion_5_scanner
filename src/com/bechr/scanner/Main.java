package com.bechr.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("input number!");
            int result = sc.nextInt();

            System.out.println("you picked: " + result );

        } while (true);

    }

}
