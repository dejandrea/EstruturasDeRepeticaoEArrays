package br.com.dio.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        int numero;
        int operador;

        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um operador para a tabuada.");
        System.out.println("Digite 1 para SOMA e 2 para MULTIPLICAÇÃO:");
        operador = scan.nextInt();

        System.out.println("Agora escolha um número entre 1 e 10 para gerar a tabuada:");
        numero = scan.nextInt();

        if (numero < 0 | numero > 10) System.out.println("número inválido");
        else {
            if (operador == 1){
                System.out.println("Tabuada ADIÇÃO de "+numero+":");
                for (int i = 0; i <= 10;i++){
                    System.out.println(numero+ " + "+ i +" = " +(numero+i) );
                }
            } else{
                System.out.println("Tabuada MULTIPLICACAO de "+numero+":");
                for (int i = 0; i <= 10;i++){
                    System.out.println(numero+ " * "+ i +" = " +(numero*i) );
                }
            }

        }

    }
}
