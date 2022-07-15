package br.com.dio.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length;i++){
            for (int j = 0; j < M.length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.print("Matriz: ");
        for (int i = 0; i < M.length;i++){
            System.out.println("");
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j]+"  ");
            }
        }
        System.out.print("\nMatriz: ");
        for (int[] linha:M) {
            System.out.println();
            for (int coluna:linha) {
                System.out.print(coluna+"  ");
            }
        }
    }
}
