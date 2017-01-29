package LacoRepeticao;

import java.util.Scanner;

public class Q08 {

    /**
     * Faça um programa que leia 5 números e informe a soma e a média dos
     * números
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        int soma = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.println("Informe o " + (i + 1) + " número: ");
            n[i] = input.nextInt();

            soma = soma + n[i];
        }
        System.out.println("Soma: " + soma + " Média: " + (soma / n.length));

    }

}
