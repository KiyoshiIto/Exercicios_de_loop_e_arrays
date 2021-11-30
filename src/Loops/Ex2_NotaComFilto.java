package Loops;

import java.util.Scanner;

public class Ex2_NotaComFilto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;


        System.out.println("Nota:");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota invalida!");
            System.out.println("Digite novamente:");
            System.out.println("Nota:");
            nota = scan.nextInt();

        }
        System.out.println("Nota: "+nota);
    }
}
