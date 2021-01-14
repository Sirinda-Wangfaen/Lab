/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        if (weight > 0 && height > 0) {
            weight = weight / 2.2046;
            height = height / 39.370;

            double bmi = weight / Math.pow(height, 2);

            System.out.println("BMI is " + bmi);
        }
    }

}
