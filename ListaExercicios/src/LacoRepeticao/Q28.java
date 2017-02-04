package LacoRepeticao;

import java.util.Scanner;

public class Q28 {

    /**
     * Faça um programa que calcule o valor total investido por um colecionador
     * em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário
     * deverá informar a quantidade de CDs e o valor para em cada um.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a QTD de CDs");
        int qtdCDs = input.nextInt();
        float valorCDs[] = new float[qtdCDs];
        int soma = 0;
        for (int i = 0; i < valorCDs.length; i++) {
            System.out.println("Informe o valor do CD " + (i + 1));
            valorCDs[i] = input.nextInt();
            soma += valorCDs[i];
        }

        System.out.println("Valor medio investido em cada CD ");
//        for (int i = 0; i < valorCDs.length; i++) {
//            System.out.println((i + 1) + "=" + (valorCDs[i] / qtdCDs));
//        }
        System.out.println("O médio investido é de " + (soma / qtdCDs));
        System.out.println("O valor total investido é de " + soma);

    }

}
