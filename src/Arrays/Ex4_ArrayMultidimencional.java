package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex4_ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];


        for (int i=0;i< matriz.length;i++){
            for (int j=0;j< matriz[i].length;j++){
                matriz[i][j] = random.nextInt(10);
            }
        }
        for (int[] linha : matriz) {

            for (int coluna : linha) {
                System.out.println(coluna + " ");
            }
            System.out.println();

            int num = 5, count = 1;
            while(count <= 3) {
                ++count;
                num += count;
            }
            System.out.println(num);


        }
    }
}
