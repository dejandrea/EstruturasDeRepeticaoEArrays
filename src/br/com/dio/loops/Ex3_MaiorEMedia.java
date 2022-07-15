package br.com.dio.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        double media = 0;
        double soma = 0;
        int maior = 0;
        int num1,count = 0;

        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número:");
            num1 = scan.nextInt();
            soma += num1;
            if (num1 > maior){
                maior = num1;
            }
            count ++;
        }while (count <5);

        media = soma/5;

        System.out.println("A média dos valores é: "+media);
        System.out.println("O maior número digitado foi: "+maior);
    }
}
