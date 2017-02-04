/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LacoRepeticao;

import java.util.Scanner;

/**
 *
 * @author Jackson Meires
 */
public class Q35 {

    /**
     * Encontrar números primos é uma tarefa difícil. Faça um programa que gera
     * uma lista dos números primos existentes entre 1 e um número inteiro
     * informado pelo usuário.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe número para ver a sequencia de números primos");
        int num = input.nextInt();
        int count = 0;

        System.out.println("Números Primos");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 1 && count <= 2) {
                System.out.println(i);
            }
            count = 1;
        }
    }

}
