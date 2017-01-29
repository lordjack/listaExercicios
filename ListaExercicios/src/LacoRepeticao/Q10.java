package LacoRepeticao;

import java.util.Scanner;

public class Q10 {

    /**
     * Faça um programa que receba dois números inteiros e gere os números
     * inteiros que estão no intervalo compreendido por eles.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.println("Informe primeiro número inteiro");
        n1 = input.nextInt();
        System.out.println("Informe segundo número inteiro");
        n2 = input.nextInt();
        
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }

}
