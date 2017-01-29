package LacoRepeticao;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Q21 {

    /**
     * Faça um programa que peça um número inteiro e determine se ele é ou não
     * um número primo. Um número primo é aquele que é divisível somente por ele
     * mesmo e por 1.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, count = 0;

        System.out.println("Informe um número");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count >= 1 && count <= 2) {
            System.out.println("o numero " + n + " é primo");
        } else {
            System.out.println("o numero " + n + " não é primo");
        }

    }
}
