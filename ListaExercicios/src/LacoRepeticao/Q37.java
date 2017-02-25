package LacoRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q37 {

    /**
     * Uma academia deseja fazer um senso entre seus clientes para descobrir o
     * mais alto, o mais baixo, a mais gordo e o mais magro, para isto você deve
     * fazer um programa que pergunte a cada um dos clientes da academia seu
     * código, sua altura e seu peso. O final da digitação de dados deve ser
     * dada quando o usuário digitar 0 (zero) no campo código. Ao encerrar o
     * programa também deve ser informados os códigos e valores do clente mais
     * alto, do mais baixo, do mais gordo e do mais magro, além da média das
     * alturas e dos pesos dos clientes
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");
        double maiorAltura = 0, menorAltura = 9999, maiorPeso = 0, menorPeso = 9999, altura = 0, peso = 0, mediaAltura = 0, mediaPeso = 0;
        int codigocliente = -1, clienteMaiorPeso = 0, clienteMenorPeso = 0, clienteMaiorAltura = 0, clienteMenorAltura = 0;
        int count = 0;

        while (codigocliente != 0) {
            System.out.println("Informe o Código do Cliente");
            codigocliente = input.nextInt();

            if (codigocliente != 0) {
                System.out.println("Informe altura do Cliente: " + codigocliente);
                altura = input.nextDouble();
                System.out.println("Informe peso do Cliente: " + codigocliente);
                peso = input.nextDouble();
                mediaAltura += altura;
                mediaPeso += peso;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
                clienteMaiorAltura = codigocliente;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                clienteMenorAltura = codigocliente;
            }
            if (peso > maiorPeso) {
                maiorPeso = peso;
                clienteMaiorPeso = codigocliente;
            }
            if (peso < menorPeso) {
                menorPeso = peso;
                clienteMenorPeso = codigocliente;
            }
            count++;
        }
        System.out.println("Cliente: " + clienteMaiorAltura + " Maior Altura: " + maiorAltura);
        System.out.println("Cliente: " + clienteMenorAltura + " Menor Altura: " + menorAltura);
        System.out.println("Cliente: " + clienteMaiorPeso + " Maior Peso: " + maiorPeso);
        System.out.println("Cliente: " + clienteMenorPeso + " Menor Peso: " + menorPeso);
        System.out.println("QTD de Clientes" + count);
        System.out.println("Media Altura: " + Double.valueOf(formato.format(mediaAltura / count)));
        System.out.println("Media Peso: " + Double.valueOf(formato.format(mediaPeso / count)));

    }

}
