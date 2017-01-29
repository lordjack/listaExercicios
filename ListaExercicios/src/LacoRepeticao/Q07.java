package LacoRepeticao;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números e informe o maior número.
 */
public class Q07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        int maior = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.println("Informe o " + (i + 1) + " número: ");
            n[i] = input.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
            for (int j = 0; j < n.length; j++) {
                if (maior < n[j]) {
                    maior = n[j];
                }
            }
        }
        System.out.println("Maior: " + maior);
    }
}
