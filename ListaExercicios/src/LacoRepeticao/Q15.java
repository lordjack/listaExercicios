package LacoRepeticao;

import java.util.Scanner;

public class Q15 {

    /**
     * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
     * Faça um programa capaz de gerar a série até o n ésimo termo.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 1, num2 = 0, aux, n;

        System.out.println("Informe um número:");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(num1);
            aux = num1;
            num1 = num1 + num2;
            num2 = aux;
        }
    }

}
