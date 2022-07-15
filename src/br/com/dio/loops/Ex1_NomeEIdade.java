package br.com.dio.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        String name;
        int idade;

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Digite o nome:");
            name = scan.next();
            if (name.equals("0")) {
                break;
            }
            System.out.println("Digite a idade:");
            idade = scan.nextInt();
        }
    }
}
