package LacoRepeticao;

import java.util.Scanner;

public class Q27 {

    /**
     * Faça um programa que calcule o número médio de alunos por turma. Para
     * isto, peça a quantidade de turmas e a quantidade de alunos para cada
     * turma. As turmas não podem ter mais de 40 alunos.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a QTD de Turmas");
        int qtdTurmas = input.nextInt();
        int soma = 0;

        String turmas[] = new String[qtdTurmas];
        int mediaTurmas[] = new int[qtdTurmas];

        System.out.println("Informe os nomes das turmas de preferencia A, B e C...");
        for (int i = 0; i < turmas.length; i++) {
            System.out.println("Informe o nome da turma " + (i + 1));
            turmas[i] = input.next();
        }

        for (int i = 0; i < mediaTurmas.length; i++) {
            System.out.println("Informe a QTD de alunos da turma " + (turmas[i]));
            int qtdAlunos = input.nextInt();
            if (qtdAlunos <= 40) {
                mediaTurmas[i] = qtdAlunos;
            } else {
                System.out.println("Informe a QTD menor ou igual a 40 para a turma " + (turmas[i]));
                qtdAlunos = input.nextInt();
                mediaTurmas[i] = qtdAlunos;
            }
        }
        for (int i = 0; i < mediaTurmas.length; i++) {
            soma += mediaTurmas[i];
            System.out.println("Media das turmas " + turmas[i] + " = " + (mediaTurmas[i] / turmas.length));
        }
        System.out.println("Media geral de alunos por turma: " + soma / turmas.length);
    }

}
