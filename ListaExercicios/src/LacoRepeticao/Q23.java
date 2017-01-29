package LacoRepeticao;

import java.util.Scanner;

public class Q23 {

    /**
     * Faça um programa que mostre todos os primos entre 1 e N sendo N um número
     * inteiro fornecido pelo usuário. O programa deverá mostrar também o número
     * de divisões que ele executou para encontrar os números primos. Serão
     * avaliados o funcionamento, o estilo e o número de testes (divisões)
     * executados.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, count = 0, countDiv = 0;

        System.out.println("Informe um número");
        n = input.nextInt();
        System.out.println("o numero é ou não primo");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                countDiv++;
            }
            if (count >= 1 && count <= 2) {
                System.out.println(i + " é primo");
            } else {
                System.out.println(i + " não é primo");
            }
            count = 0;
        }
        System.out.println("Foi realizado um total de " + countDiv + " Divisões");
    }

}
