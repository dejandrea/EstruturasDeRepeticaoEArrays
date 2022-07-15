package br.com.dio.arrays;
/*Crie um vetor de 6 números inteiros
* e mostre-os na ordem inversa*/

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] numeros = {0,15,-15,20,-30,12};
        int count = 0;
        System.out.println("Vetor Original:");
        while (count < numeros.length-1){
            System.out.print(numeros[count]+" ");
            count++;
        }
        System.out.println("\nVetor inverso:");
        for (int i = (numeros.length-1);i >= 0;i--){
            System.out.print(numeros[i]+" ");
        }

    }
}
