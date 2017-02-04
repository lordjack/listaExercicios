package LacoRepeticao;

import java.util.Scanner;

public class Q26 {

    /**
     * Numa eleição existem três candidatos. Faça um programa que peça o número
     * total de eleitores. Peça para cada eleitor votar e ao final mostrar o
     * número de votos de cada candidato.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a QTD total de Eleitores");
        int qtd = input.nextInt();

        String[] votos = new String[qtd];
        int candidatoA = 0, candidatoB = 0, candidatoC = 0;

        System.out.println("As opções dos candidados são A, B e C");
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Eleitor " + (i + 1) + " informe seu voto");
            votos[i] = input.next();
        }

        for (int i = 0; i < votos.length; i++) {
            if (votos[i].equalsIgnoreCase("A")) {
                candidatoA++;
            } else if (votos[i].equalsIgnoreCase("B")) {
                candidatoB++;
            } else if (votos[i].equalsIgnoreCase("C")) {
                candidatoC++;
            }
        }
        System.out.println("Número de votos de cada candidato: ");
        System.out.println("Candidato A: " + candidatoA);
        System.out.println("Candidato B: " + candidatoB);
        System.out.println("Candidato C: " + candidatoC);
        System.out.println("Total de Eleitores: " + (candidatoA + candidatoB + candidatoC));
    }

}
