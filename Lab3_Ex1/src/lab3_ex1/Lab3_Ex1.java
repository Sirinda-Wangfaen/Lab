/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ex1;

public class Lab3_Ex1 {

    public static void main(String[] args) {
        int totalNum = 100, perLine = 10, count = 1, number = 2;
        while (count <= totalNum) {
            if(checkPrime(number) && checkPalindrome(number)){
                System.out.print(number + " ");
                if (count % perLine == 0){
                    System.out.println();
                }
                count++;
            }
            number++;
        }
    }

    public static boolean checkPrime(int num) {
        if (num == 2) {
            return true;
        }
        for (int divnum = 2; divnum <= num / 2; divnum++) {
            if (num % divnum == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(int num) {
        String s = String.valueOf(num);
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

}
