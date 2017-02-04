package LacoRepeticao;

import java.util.Scanner;

public class Q36 {

    /**
     * Desenvolva um programa que faça a tabuada de um número qualquer inteiro
     * que será digitado pelo usuário, mas a tabuada não deve necessariamente
     * iniciar em 1 e terminar em 10, o valor inicial e final devem ser
     * informados também pelo usuário, conforme exemplo abaixo: 
     * Montar a tabuada de: 5
     * Começar por: 4
     * Terminar em: 7
     * Vou montar a tabuada de 5 começando em 4 e terminando em 7:
     * 5 X 4 = 20
       5 X 5 = 25
       5 X 6 = 30
       5 X 7 = 35
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe número imprimir a tabuada");
        int num = input.nextInt();
        System.out.println("Informe número inicial da tabuada");
        int numInicio = input.nextInt();
        System.out.println("Informe número final da tabuada");
        int numFinal = input.nextInt();
        
        if(numInicio<numFinal){
            for (int i = numInicio; i <= numFinal; i++) {
                System.out.println(num+" X "+i+" = "+(num*i));
            }
        }else{
            System.out.println("O número inicial deve ser menor que o numero final");
        }
    }
}
