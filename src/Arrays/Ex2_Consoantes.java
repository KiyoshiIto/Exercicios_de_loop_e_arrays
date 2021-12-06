package Arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];
        int quantidadeDeConsoantes = 0;
        int contador = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("u")|
                    letra.equalsIgnoreCase("o")
            ))
            {
                vetor[contador] = letra;
                quantidadeDeConsoantes++;
            }
            contador++;
        }while (contador< vetor.length);

        for (String consoante:
             vetor) {
            if (consoante != null)
            System.out.println(consoante + " ");
        }
        System.out.println("O numero de consoantes é: " + quantidadeDeConsoantes);
    }
}
