package Loops;

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        int quantidadeDeNumeros;
        int numero;
        int contadorDeLoop = 0;
        int contadorDePares = 0;
        int contadorDeImpares = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de Números que deseja:");
        quantidadeDeNumeros = scan.nextInt();

        do {
            contadorDeLoop++;
            System.out.println("Digite o " + contadorDeLoop + "o número:");
            numero = scan.nextInt();
            if((numero % 2) == 0){
                contadorDePares++;
            }else{
                contadorDeImpares++;
            }

        }while (contadorDeLoop<quantidadeDeNumeros);

        System.out.println("A quantidade de Pares: " + contadorDePares);
        System.out.println("A quantidade de Impares: " + contadorDeImpares);

    }

}
