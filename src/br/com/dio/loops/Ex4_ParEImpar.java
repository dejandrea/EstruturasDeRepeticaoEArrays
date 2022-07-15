package br.com.dio.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        int num,par = 0,impar = 0,count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de números desejados:");
        count = scan.nextInt();

        do {
            System.out.println("Digite um número:");
            num = scan.nextInt();
            if (num % 2 ==0) {
                par ++;
            }else{
                impar ++;
            }
            count --;
        }while (count > 0);

        System.out.println("Quantidade de números pares: "+par);
        System.out.println("Quantidade de números impares: "+impar);
    }
}
