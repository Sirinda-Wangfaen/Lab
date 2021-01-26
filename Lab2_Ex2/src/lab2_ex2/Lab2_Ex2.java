/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_ex2;

import java.util.Scanner;

public class Lab2_Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player, computer;
        System.out.print("scissor (0), rock (1), paper (2): ");
        player = input.nextInt();
        computer = (int) (Math.random() * 3);
        if (player >= 0 && player <= 2) {
            System.out.print("The computer is ");
            switch (computer) {
                case 0:
                    System.out.print("scissor. ");
                    break;
                case 1:
                    System.out.print("rock. ");
                    break;
                case 2:
                    System.out.print("paper. ");
                    break;
            }
            System.out.print("You are ");
            switch (player) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
                    break;
            }
            if (player == computer) {
                System.out.println(" too. It is a draw");
            } else {
                if ((player == 0 && computer == 2) || (player == 1 && computer == 0) || (player == 2 && computer == 1)) {
                    System.out.println(". You won");
                } else {
                    System.out.println(". You lose");
                }
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
