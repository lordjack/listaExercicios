package LacoRepeticao;

import java.util.Scanner;

public class Q32 {

    /**
     * Faça um programa que calcule o fatorial de um número inteiro fornecido
     * pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo
     * abaixo:Fatorial de: 5 5! = 5 . 4 . 3 . 2 . 1 = 120
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um numero para calcular o fatoreal");
        double num = input.nextInt();
        double soma = num;

        for (double i = 1; i < num; i++) {
            soma = soma * (num - i);
        }
        System.out.println("O fatorial é: " + soma);
    }

}
