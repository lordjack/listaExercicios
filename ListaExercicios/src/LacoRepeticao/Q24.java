package LacoRepeticao;

import java.util.Scanner;

public class Q24 {

    /**
     * Faça um programa que calcule o mostre a média aritmética de N notas.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a QTD de Notas");
        int qtd = input.nextInt();
        int[] notas = new int[qtd];
        int media = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe a Nota " + (i + 1));
            notas[i] = input.nextInt();
            media += notas[i];
        }
        System.out.println("A média das notas é: " + (media / notas.length));
    }

}
