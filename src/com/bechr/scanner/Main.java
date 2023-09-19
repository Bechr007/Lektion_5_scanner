package com.bechr.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPlaying = true;

       do {
           int result = scannerNumber();

           if (result > 1000){
               isPlaying = false;
           } else {

               for (int i = 0; i < result; i++) {
                   System.out.println(i);
                   System.out.println("loading...");
               }
           }

       } while (isPlaying);

    }

    public static int scannerNumber(){
        Scanner sc = new Scanner(System.in);

        System.out.println("insert a number");

        return sc.nextInt();
    }

    public static String scannerText(){
        Scanner sc = new Scanner(System.in);

        System.out.println("insert a name");
        String input = sc.nextLine();
        return input;
    }

}
