package com.nastajus.input;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        GetInputFromUser();
    }

    static void GetInputFromUser() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = in.nextLine();
        System.out.println("You entered string: " + s);

        System.out.println("Enter an integer");
        int i = in.nextInt();
        System.out.println("You entered integer: " + i);

        System.out.println("Enter a float");
        float f = in.nextFloat();
        System.out.println("You entered float: " + f);
    }
}
