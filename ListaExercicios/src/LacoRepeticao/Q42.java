package LacoRepeticao;

import java.util.Random;

public class Q42 {

    /**
     * Faça um programa que leia uma quantidade indeterminada de números
     * positivos e conte quantos deles estão nos seguintes intervalos: [0-25],
     * [26-50], [51-75] e [76-100]. A entrada de dados deverá terminar quando
     * for lido um número negativo.
     */
    public static void main(String[] args) {
        Random r = new Random();
        int count2650 = 0, count5175 = 0, count76100 = 0;
        int numRandom = 1;

        while (0 < numRandom) {
            numRandom = ((r.nextInt(200)) * 2) - 100;
            if (numRandom >= 25 && numRandom <= 50) {
                count2650++;
            } else if (numRandom >= 25 && numRandom <= 50) {
                count5175++;
            } else if (numRandom >= 76 && numRandom <= 100) {
                count76100++;
            }
        }
        System.out.println("Intervalo [26-50] " + count2650);
        System.out.println("Intervalo [51-75] " + count5175);
        System.out.println("Intervalo [76-100] " + count76100);
    }

}
