package Loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contadorDeLoop = 0;
        int resultado;
        int numero;

        System.out.println("Digite o númros que deseja a Tabuada:");
        numero = scan.nextInt();
            do {
                contadorDeLoop++;
                resultado = contadorDeLoop * numero;

                System.out.println(numero + " X " + contadorDeLoop + " = " + resultado);
            } while (contadorDeLoop < 10);
    }
}
