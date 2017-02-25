package LacoRepeticao;

import java.util.Scanner;

public class Q38 {

    /**
     * Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se
     * que: a. Esse funcionário foi contratado em 1995, com salário inicial de
     * R$ 1.000,00; b. Em 1996 recebeu aumento de 1,5% sobre seu salário
     * inicial; A partir de 1997 (inclusive), os aumentos salariais sempre
     * correspondem ao dobro do percentual do ano anterior. Faça um programa que
     * determine o salário atual desse funcionário. Após concluir isto, altere o
     * programa permitindo que o usuário digite o salário inicial do
     * funcionário.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salarioInicial = -1, novoSalario = 0;
        int anoInicial = 0, segundoAno = 0, terceiroAno = 0;

        while (salarioInicial != 0) {
            System.out.println("Informe o Salário Inicial");
            salarioInicial = input.nextFloat();
            if (salarioInicial != 0) {
                System.out.println("Salario em 1995: " + salarioInicial);
                System.out.println("Salario em 1996: " + (salarioInicial * 1.015));
                System.out.println("Salario em 1997: " + (salarioInicial * 1.03));
            }
        }

    }

}
