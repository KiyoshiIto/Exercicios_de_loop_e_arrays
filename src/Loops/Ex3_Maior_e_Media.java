package Loops;

import java.util.Scanner;

public class Ex3_Maior_e_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int tamanho;
        int maximo = 0;
        int minimo = 0;
        int soma = 0;
        //float media = 0;
        int i = 0;
        System.out.println("Digite quantos números deseja fazer a média:");
        tamanho = scan.nextInt();


        do {
            i++;
            System.out.println("Digite o "+i+"o número:");
            numero = scan.nextInt();
            soma = soma + numero;
            if (i == 1) {
                maximo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
            if (i == 1) {
                minimo = numero;
            }
            if (numero < minimo){
                minimo = numero;
            }

        }while (i <tamanho);

        System.out.println("Maior número: " + maximo);
        System.out.println("Menor número: " + minimo);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + ((double)soma/tamanho));

    }
}
