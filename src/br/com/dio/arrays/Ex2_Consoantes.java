package br.com.dio.arrays;
/*Faça um programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas
* imprima as consoantes*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        String[] letras = new String[6];
        String[] vogais = new String[6];
        String[] consoantes = new String[6];
        int qtdConsoantes = 0;
        Scanner scan = new Scanner(System.in);
        int count = 0;
        do {
            System.out.println("Digite uma Letra:");
            letras[count] = scan.next();
            count++;
        }
        while (count < letras.length);

        for (int i = 0;i < letras.length;i++){
            if(!(letras[i].equalsIgnoreCase("a")|
                    letras[i].equalsIgnoreCase("e")|
                    letras[i].equalsIgnoreCase("i")|
                    letras[i].equalsIgnoreCase("o")|
                    letras[i].equalsIgnoreCase("u"))){
                consoantes[qtdConsoantes] = letras[i];
                qtdConsoantes ++;
            }
        }
        for (String consoante : consoantes) {
           if (consoante != null)
               System.out.print(consoante+" ");
        }
        System.out.println("\nQuantidade de consoantes: "+qtdConsoantes);

    }
}
