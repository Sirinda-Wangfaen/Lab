/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter a number between 0 and 1000: ");
        int num = numInput.nextInt();

        if (num > 0 && num < 1000) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("The sum of the digits is " + sum);
        }
    }

}
