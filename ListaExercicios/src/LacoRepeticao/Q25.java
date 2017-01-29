package LacoRepeticao;

import java.util.Scanner;

public class Q25 {

    /**
     * Faça um programa que peça para n pessoas a sua idade, ao final o programa
     * devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60
     * e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa,
     * conforme a média calculada.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a QTD de Pessoas");
        int qtd = input.nextInt();
        int[] idades = new int[qtd];
        int media = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe uma idade da pessoa " + (i + 1));
            idades[i] = input.nextInt();
            media += idades[i];
        }
        media = media / idades.length;
        if (media <= 25) {
            System.out.println("O Grupo é Jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("O Grupo é Adulto");
        } else if (media > 60) {
            System.out.println("O Grupo é Adulto");
        }
    }

}
