/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_ex3;

import java.util.Scanner;

public class Lab3_Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeMatrix, count = 1;
        System.out.print("Enter the size for the matrix: ");
        sizeMatrix = input.nextInt();
        if (sizeMatrix >= 2) {
            int[][] matrix = new int[sizeMatrix][sizeMatrix];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 2);
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

            int[] rows = checkRow(matrix);
            count = 0;
            for (int i = 0; i < rows.length; i++) {
                if (rows[i] >= 0) {
                    System.out.println("All " + rows[i] + "s on row " + (i + 1));
                } else {
                    count++;
                }
                if (count == rows.length) {
                    System.out.println("No same numbers on a row");
                }
            }

            int[] columns = checkColumn(matrix);
            count = 0;
            for (int i = 0; i < columns.length; i++) {
                if (columns[i] >= 0) {
                    System.out.println("All " + columns[i] + "s on column " + (i + 1));
                } else {
                    count++;
                }
                if (count == columns.length) {
                    System.out.println("No same numbers on a column");
                }
            }

            int num = checkSuperdia(matrix);
            if (num >= 0) {
                System.out.println("All " + num + "s on the superdiagonal");
            } else {
                System.out.println("No same numbers on the superdiagonal ");
            }

            num = checkDia(matrix);
            if (num >= 0) {
                System.out.println("All " + num + "s on the diagonal");
            } else {
                System.out.println("No same numbers on the diagonal ");
            }

            num = checkSubdia(matrix);
            if (num >= 0) {
                System.out.println("All " + num + "s on the subdiagonal");
            } else {
                System.out.println("No same numbers on the subdiagonal ");
            }
        }
    }

    public static int checkDia(int[][] m) {
        int[] count = new int[2];
        count[0] = 0;
        count[1] = 0;
        for (int i = 0, j = 0; i < m.length; i++, j++) {
            count[m[i][j]]++;
            if (count[0] == m.length) {
                return 0;
            } else if (count[1] == m.length) {
                return 1;
            }
        }
        return -1;
    }

    public static int checkSubdia(int[][] m) {
        int[] count = new int[2];
        count[0] = 0;
        count[1] = 0;
        for (int i = 1, j = 0; i < m.length ; i++, j++) {
            count[m[i][j]]++;
            if (count[0] == m.length - 1) {
                return 0;
            }
            if (count[1] == m.length - 1) {
                return 1;
            }
        }
        return -1;
    }

    public static int checkSuperdia(int[][] m) {
        int[] count = new int[2];
        count[0] = 0;
        count[1] = 0;
        for (int i = 0, j = 1; i < m.length - 1; i++, j++) {
            count[m[i][j]]++;
            if (count[0] == m.length - 1) {
                return 0;
            }
            if (count[1] == m.length - 1) {
                return 1;
            }
        }
        return -1;
    }

    public static int[] checkRow(int[][] m) {
        int[] result = new int[m.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        int[] count = new int[2];
        for (int i = 0; i < m.length; i++) {
            count[0] = 0;
            count[1] = 0;

            for (int j = 0; j < m[i].length; j++) {
                count[m[i][j]]++;
                if (count[0] < j + 1 && count[1] < j + 1) {
                    break;
                }
            }
            if (count[0] >= m.length || count[1] >= m.length) {
                result[i] = count[0] > count[1] ? 0 : 1;
            }
        }
        return result;
    }

    public static int[] checkColumn(int[][] m) {
        int[] result = new int[m.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }

        int[] count = new int[2];
        for (int i = 0; i < m.length; i++) {
            count[0] = 0;
            count[1] = 0;

            for (int j = 0; j < m[i].length; j++) {
                count[m[j][i]]++;
                if (count[0] < j + 1 && count[1] < j + 1) {
                    break;
                }
            }

            if (count[0] >= m.length || count[1] >= m.length) {
                result[i] = count[0] > count[1] ? 0 : 1;
            }
        }
        return result;
    }

}
