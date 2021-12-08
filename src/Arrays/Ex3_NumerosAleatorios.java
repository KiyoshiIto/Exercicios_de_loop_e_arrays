package Arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
       // int cont0 =0, cont1=0; contadores auoxiliares para medir a disperção da função Random
        int[] numerosAleatorios = new int[20];
        int[] numerosSucessores = new int[20];
        for (int i=0;i<numerosAleatorios.length;i++){
            int numero = random.nextInt(101); // como o objetivo é um número aleatório entre 0 e 100 essa lista contem 101 elementeos
            numerosAleatorios[i] = numero;
            numerosSucessores[i] = numero+1;
            /*
            if (numero == 0){
                cont0++;
            }else cont1++;
            */
        }
        System.out.println("Números aletórios: ");
        for (int numero:
             numerosAleatorios) {
            System.out.println(numero + " ");
        }
        System.out.println("Números sucessores: ");
        for (int numero:
             numerosSucessores) {
            System.out.println(numero + " ");
        }
        /*
        // essa parte serve par a medir a Disperção dos dados gerados na função Random
        // Resultado esperado é de 50% para cada
        System.out.println(numerosAleatorios.length);
        System.out.println("Quantidade de 0s: " + cont0 + "Porcentagem 0s: " + ((float)cont0/(float) numerosAleatorios.length));
        System.out.println("Quantidade de 1s: " + cont1 + "Porcentagem 1s: " + ((float)cont1/ (float)numerosAleatorios.length));
        */

    }
}
