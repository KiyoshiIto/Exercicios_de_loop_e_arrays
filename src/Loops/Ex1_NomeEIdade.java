package Loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String auxnome;
        int idade;

        while (true){
            System.out.println("Digite o nome:");
            auxnome = scan.next();
            if (auxnome.equals("0")) break;
            nome = auxnome;

            System.out.println("Digite a Idade");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);


        }


            }
}
