/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ex5;

import java.util.Scanner;

public class Lab2_Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the number of lines: ");
        num = input.nextInt();
        if (num >= 1 && num <= 15) {
            for (int row = 1; row <= num; row++) {
                for (int space = num - row; space >= 1; space--) {
                    System.out.print("  ");
                }
                for (int numfront = row; numfront >= 2; numfront--) {
                    System.out.print(numfront + " ");
                }
                for (int numback = 1; numback <= row; numback++) {
                    System.out.print(numback + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error");
        }
    }
}
