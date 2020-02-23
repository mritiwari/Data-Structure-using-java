package com.codingblocks.extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Soft {
    public static void main(String[] args) {
        int intial[][] = new int[2][2];
        int target[][] = new int[2][2];

        int positon_i = 0, positon_j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a inital values : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                intial[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter a target values for blank use 0 : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                target[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (intial[i][j] == 0) {
                    positon_i = i;
                    positon_j = j;
                }
            }
        }
    }





}


