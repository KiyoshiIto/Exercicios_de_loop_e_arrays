package Arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};
        int contador;
        contador = vetor.length-1;
        while (contador >= 0){
            System.out.println(vetor[contador]);
            contador--;
        }

            for (int i = vetor.length-1; i >= 0 ; i--){
            System.out.println(vetor[i]);
        }
        }

    }

