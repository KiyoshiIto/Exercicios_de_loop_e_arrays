package Loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int contador =0;
        int numero;
        int fatorial = 1;

        System.out.println("Digire o número que deseja o Fatorial:");
        numero = scan.nextInt();

        do{
            contador++;
            fatorial = fatorial*contador;
        }while (contador < numero);
        System.out.println("Fatorial de "+ numero + " é " + fatorial);
        fatorial = 1;
        for (int i = 1;i <= numero;i++){
            fatorial = fatorial*i;
        }
        System.out.println("Fatorial de "+ numero + " é " + fatorial);

    }
}
