/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ex3;

import java.util.Scanner;

public class Lab2_Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, month, day, dayweek;
        System.out.print("Enter year: (e.g., 2012): ");
        year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        day = input.nextInt();
        if (year > 0 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if (month == 1) {
                month = 13;
                year--;
            }
            if (month == 2) {
                month = 14;
                year--;
            }
            dayweek = (day + ((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7;
            System.out.print("Day of the week is ");
            switch (dayweek) {
                case 0:
                    System.out.println("Saturday");
                    break;
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
            }
        }
        else
            System.out.println("Error");
    }
}
