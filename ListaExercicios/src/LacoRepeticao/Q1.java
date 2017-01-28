package LacoRepeticao;

import java.util.Scanner;

/**
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
 * caso o valor seja inválido e continue pedindo até que o usuário informe um
 * valor válido.
 */
public class Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Informe um numero valido");
            n = input.nextInt();

        } while (n > 10 || n < 0);
        System.out.println("O numero é " + n);

    }

}
