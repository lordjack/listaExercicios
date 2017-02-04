package LacoRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q33 {

    /**
     * O Departamento Estadual de Meteorologia lhe contratou para desenvolver um
     * programa que leia as um conjunto indeterminado de temperaturas, e informe
     * ao final a menor e a maior temperaturas informadas, bem como a média das
     * temperaturas.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");
        System.out.println("Informe a QTD de Temperaturas");
        int qtd = input.nextInt();
        double[] temp = new double[qtd];
        double menor = 0, maior = 999999, media = 0;
        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe um valor para a temperatura " + (i + 1));
            temp[i] = input.nextDouble();
            media += temp[i];
        }

        for (int i = 0; i < qtd; i++) {
            if (maior > temp[i]) {
                maior = temp[i];
            }
            if (menor < temp[i]) {
                menor = temp[i];
            }
            for (int j = 0; j < qtd; j++) {
                if (maior < temp[j]) {
                    maior = temp[j];
                }
                if (menor > temp[j]) {
                    menor = temp[j];
                }
            }
        }
        System.out.println("Maior temperatura: " + Double.valueOf(formato.format(maior)));
        System.out.println("Menor temperatura: " + Double.valueOf(formato.format(menor)));
        System.out.println("Media da temperatura: " + Double.valueOf(formato.format(media / qtd)));

    }

}
