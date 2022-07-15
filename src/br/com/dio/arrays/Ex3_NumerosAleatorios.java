package br.com.dio.arrays;
/*
* Faça um programa que leia 20 números inteiros aleatórios entre 0 e 100,
* armazene-os em um vetor.
* Ao final mostre os números e seus sucessores.*/

import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan  = new Scanner(System.in);
        int[] numeros = new int[20];
        int count = 0;
        do {
//            System.out.println("Digite um número:");
//            numeros[count] = scan.nextInt();
            numeros[count] = random.nextInt(100);
            count++;
        }while (count < numeros.length);

        for (int numero : numeros) {
            System.out.println("número: "+numero+" Sucessor: "+(numero+1)+" Antecessor: "+(numero-1));
        }
    }
}
