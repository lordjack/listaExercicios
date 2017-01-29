package LacoRepeticao;

import java.util.Scanner;

public class Q11 {

    /**
     * Altere o programa anterior para mostrar no final a soma dos números
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, soma = 0;

        System.out.println("Informe primeiro número inteiro");
        n1 = input.nextInt();
        System.out.println("Informe segundo número inteiro");
        n2 = input.nextInt();

        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
            soma = soma + i;
        }
        System.out.println("Soma: "+soma);
    }

}
