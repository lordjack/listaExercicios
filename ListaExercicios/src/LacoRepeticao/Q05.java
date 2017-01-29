package LacoRepeticao;

import java.util.Scanner;

public class Q05 {

    /**
     * Altere o programa anterior permitindo ao usuário informar as populações e
     * as taxas de crescimento iniciais. Valide a entrada e permita repetir a
     * operação.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float tx1, tx2;
        int p1, p2, ano = 0;

        System.out.println("Informe a qtd da 1 população");
        p1 = input.nextInt();
        System.out.println("Informe a qtd da 2 população");
        p2 = input.nextInt();
        System.out.println("Informe o valor da 1 taxa");
        tx1 = input.nextFloat();
        System.out.println("Informe o valor da 2 taxa");
        tx2 = input.nextFloat();

        if (p1 > 0 && p1 > 0 && tx1 > 0 && tx2 > 0) {
            for (int i = 1; p1 <= p2; i++) {
                p1 = (int) (p1 + (p1 * (tx1 / 100)));
                p2 = (int) (p2 + (p2 * (tx2 / 100)));
                ano = i;
            }
            System.out.println("A qtd de anos será: " + ano);
        } else {
            System.out.println("Dados informados invalido. População 01: " + p1 + " População 02: " + p2 + " Taxa 01: " + tx1 + " Taxa 01: " + tx1);
        }
    }

}
