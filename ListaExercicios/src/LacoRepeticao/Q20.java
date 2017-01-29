package LacoRepeticao;

import java.util.Scanner;

public class Q20 {

    /**
     * Altere o programa de cálculo do fatorial, permitindo ao usuário calcular
     * o fatorial várias vezes e limitando o fatorial a números inteiros
     * positivos e menores que 16.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, result = 1;

        do {
            System.out.println("Informe um número");
            n = input.nextInt();

            if (n == 0 || n == 1) {
                result = 1;
            } else {
                for (int i = 0; i < n - 1; i++) {
                    result += result * (i + 1);
                }
            }
            if (n < 16 && n > 0) {
                System.out.println("O fatorial é: " + result);
                result = 1;
            } else {
                System.out.println("O número informado e maior que 16 ou não é um número possitivo");
            }
        } while (n < 16 && n > 0);
    }

}
