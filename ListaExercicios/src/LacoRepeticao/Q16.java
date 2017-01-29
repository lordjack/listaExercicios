package LacoRepeticao;

import java.util.Scanner;

public class Q16 {

    /**
     * A série de Fibonacci é formada pela seqüência
     * 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o
     * valor seja maior que 500
     */
    public static void main(String[] args) {
        int num1 = 1, num2 = 0, aux, n;

        for (int i = 0; num1 < 611 ; i++) {
            System.out.println(num1);
            aux = num1;
            num1 = num1 + num2;
            num2 = aux;
        }
    }

}
