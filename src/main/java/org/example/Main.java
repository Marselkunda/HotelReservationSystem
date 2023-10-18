package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Welcome to Marsel Hotel=====\n\n\n1-Login\n2-Signup");
        int pro = sc.nextInt();
        if (pro == 1) {
            if (LoginClass.login()) {
                if (LoginClass.staffAccount()) {
                    ViewClass.staffView();
                } else ViewClass.guestView();
            }
        } else if (pro == 2) {
            SignUpClass.signUp();
        } else
            System.out.println("Wrong Input");


    }

}