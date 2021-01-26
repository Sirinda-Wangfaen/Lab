/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ex1;

import java.util.Scanner;

public class Lab2_Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayNow, dayAfter, futureDay;
        System.out.print("Enter today's day: ");
        dayNow = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        dayAfter = input.nextInt();
        if (dayNow >= 0 && dayNow <= 6 && dayAfter >= 0) {
            futureDay = (dayNow + dayAfter) % 7;
            System.out.print("Today is ");
            switch (dayNow) {
                case 0:
                    System.out.print("Sunday");
                    break;
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
            }
            System.out.print(" and the future day is ");
            switch (futureDay) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
            }
        }
        else System.out.println("Error");
    }
}
