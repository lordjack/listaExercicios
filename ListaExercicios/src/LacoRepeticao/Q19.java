package LacoRepeticao;

import java.util.Scanner;

public class Q19 {

    /**
     * Altere o programa anterior para que ele aceite apenas números entre 0 e
     * 1000.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho de um conjunto de número:");
        int num = input.nextInt();
        if (num < 1000) {

            int[] vetor = new int[num];
            int maior = 99999999, menor = 0, soma = 0;

            System.out.println("Informe " + num + " Número(s):");

            for (int i = 0; i < num; i++) {
                System.out.println("Informe o número " + (i + 1) + ":");
                vetor[i] = input.nextInt();
            }

            for (int i = 0; i < vetor.length; i++) {
                if (maior > vetor[i]) {
                    maior = vetor[i];
                }

                if (menor < vetor[i]) {
                    menor = vetor[i];
                }

                for (int j = 0; j < vetor.length; j++) {
                    if (maior < vetor[j]) {
                        maior = vetor[j];
                    }
                    if (menor > vetor[j]) {
                        menor = vetor[j];
                    }

                }
                soma += vetor[i];
            }
            System.out.println("O maior Número é: " + maior);
            System.out.println("O menor Número é: " + menor);
            System.out.println("A soma dos Números é: " + soma);
        } else {
            System.out.println("Informe o tamanho de um conjunto de número menor que 1000:");
        }
    }
}
