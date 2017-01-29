package LacoRepeticao;

import java.util.Scanner;

public class Q12 {

    /**
     * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
     * número inteiro entre 1 a 10. O usuário deve informar de qual numero ele
     * deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Informe um valor para gerar a tabuada");
        n = input.nextInt();

        System.out.println("Tabuada");
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

}
