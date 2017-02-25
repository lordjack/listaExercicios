package LacoRepeticao;

import java.util.Scanner;

public class Q39 {

    /**
     * Faça um programa que leia dez conjuntos de dois valores, o primeiro
     * representando o número do aluno e o segundo representando a sua altura em
     * centímetros. Encontre o aluno mais alto e o mais baixo. Mostre o número
     * do aluno mais alto e o número do aluno mais baixo, junto com suas
     * alturas.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 10;
        int numAluno[] = new int[num];
        int alturaAluno[] = new int[num];
        int alto = 0, baixo = 9999, alunoAlto = 0, alunoBaixo = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Informe o numero do Aluno " + (i + 1));
            numAluno[i] = input.nextInt();
            System.out.print("Sua Altura ");
            alturaAluno[i] = input.nextInt();

            if (alturaAluno[i] > alto) {
                alto = alturaAluno[i];
                alunoAlto = numAluno[i];
            }
            if (alturaAluno[i] < baixo) {
                baixo = alturaAluno[i];
                alunoBaixo = numAluno[i];
            }
        }
        System.out.println("Aluno " + alunoAlto + " é o mais alto com " + alto);
        System.out.println("Aluno " + alunoBaixo + " é o mais baixo com " + baixo);
    }

}
