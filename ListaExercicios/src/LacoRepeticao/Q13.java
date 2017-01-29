package LacoRepeticao;

import java.util.Scanner;

public class Q13 {

    /**
     * Faça um programa que peça dois números, base e expoente, calcule e mostre
     * o primeiro número elevado ao segundo número. Não utilize a função de
     * potência da linguagem.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exp, count = 1;
        float result = 0;

        System.out.println("Informe um valor para Base");
        base = input.nextInt();
        System.out.println("Informe um valor para Expoente");
        exp = input.nextInt();

        result = base;

        while (count < exp) {
            result = result * base;
            count++;
        }
        System.out.println(result);
    }

}
