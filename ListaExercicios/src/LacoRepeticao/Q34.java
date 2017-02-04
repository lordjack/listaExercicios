package LacoRepeticao;

import java.util.Scanner;

public class Q34 {

    /**
     * Os números primos possuem várias aplicações dentro da Computação, por
     * exemplo na Criptografia. Um número primo é aquele que é divisível apenas
     * por um e por ele mesmo. Faça um programa que peça um número inteiro e
     * determine se ele é ou não um número primo.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe número para ver se é primo");
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count >= 1 && count <= 2) {
            System.out.println("é Primo");
        } else {
            System.out.println("não é Primo");
        }
    }

}
