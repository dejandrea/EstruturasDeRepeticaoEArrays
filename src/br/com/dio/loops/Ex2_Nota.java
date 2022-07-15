package br.com.dio.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        int nota;

        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Digite uma nota válida:");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor Inválido!");
                continue;
            }else {
                break;
            }
        }
    }
}
