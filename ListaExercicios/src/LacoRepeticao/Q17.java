package LacoRepeticao;

import java.util.Scanner;

public class Q17 {

    /**
     * Faça um programa que calcule o fatorial de um número inteiro fornecido
     * pelo usuário. Ex.: 5!=5.4.3.2.1=120
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, result = 1;
        System.out.println("Informe um número");
        n = input.nextInt();

        if (n == 0 || n == 1) {
            result = 1;
        } else {
            for (int i = 0; i < n - 1; i++) {
                result += result * (i + 1);
            }
        }
        System.out.println("O fatorial é: " + result);
    }

}
