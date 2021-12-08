package Loops;

public class Ex7_LaçoComInterruptor {
        /*
        Faça um "for" de 1 a 14, sendo que somente múltipos de 2 sejam listados. Entretanto, quando
        o loop passar pelo 12 , o mesmo deve ser abortado.
        Faça o mesmo exemplo acima com o while.
         */
    public static void main(String[] args) {

        int vetor ;

        for (int i = 1; i <= 14; i++){
            if (i == 12) {
                break;
            }
            if ((i % 2) == 0) {
                vetor = i;
                System.out.println(vetor);

            }
        }
        System.out.println("");
       int i = 1;
        while (i<=14){
            if (i == 12) break;
            if ((i%2) == 0 ){
                vetor = i;
                System.out.println(vetor);
            }
            i++;
        }
    }



}
