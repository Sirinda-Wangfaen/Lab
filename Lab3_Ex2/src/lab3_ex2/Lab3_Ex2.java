/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ex2;

import java.util.Arrays;

public class Lab3_Ex2 {

    public static void main(String[] args) {
        int[] numlist1 = new int[5];
        int[] numlist2 = new int[4];
        for (int a = 0; a < 5; a++) {
            numlist1[a] = (int) (Math.random() * 1000);
        }
        for (int b = 0; b < 4; b++) {
            numlist2[b] = (int) (Math.random() * 1000);
        }

        int[] numlist3 = merge(numlist1, numlist2);

        System.out.print("List1 :");
        for (int c : numlist1) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.print("List2 :");
        for (int d : numlist2) {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.print("The merged list is ");
        for (int e : numlist3) {
            System.out.print(e + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] listmerge = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            listmerge[i] = list1[i];
        }
        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            listmerge[j] = list2[i];
        }
        Arrays.sort(listmerge);
        return listmerge;
    }
}
