package br.com.dio.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        int fatorial = 0;
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ditite um número para gerar o fatorial:");
        numero = scan.nextInt();

        fatorial = numero;

        for (int i = 1;i< numero;i++){
           fatorial *= (numero-i);
        }
        System.out.println(+numero+"! é: "+fatorial);
    }
}
