package LacoRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q41 {

    /**
     * Faça um programa que receba o valor de uma dívida e mostre uma tabela com
     * os seguintes dados: valor da dívida, valor dos juros, quantidade de
     * parcelas e valor da parcela. Os juros e a quantidade de parcelas seguem a
     * tabela abaixo: Quantidade de Parcelas % de Juros sobre o valor inicial da
     * dívida 1 0 3 10 6 15 9 20 12 25 Exemplo de saída do programa: Valor da
     * Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela R$
     * 1.000,00 0 1 R$ 1.000,00 R$ 1.100,00 100 3 R$ 366,00 R$ 1.150,00 150 6 R$
     * 191,67
     *
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");

        System.out.println("Informe o valor da dívida");
        float valorDivida = input.nextFloat();
        System.out.println("Informe a QTD de parcelas");
        int qtdParcelas = input.nextInt();
        float totalComJuros = 0;
        float juros = 0;

        if (qtdParcelas >= 3 && qtdParcelas <= 5) {
            totalComJuros = (float) (valorDivida * 1.1);
            juros = (float) (valorDivida * 0.1);
        } else if (qtdParcelas >= 6 && qtdParcelas <= 8) {
            totalComJuros = (float) (valorDivida * 1.15);
            juros = (float) (valorDivida * 0.15);
        } else if (qtdParcelas >= 9 && qtdParcelas <= 11) {
            totalComJuros = (float) (valorDivida * 1.20);
            juros = (float) (valorDivida * 0.20);
        } else if (qtdParcelas > 12) {
            totalComJuros = (float) (valorDivida * 1.25);
            juros = (float) (valorDivida * 0.25);
        }else{
            totalComJuros = valorDivida;
        }

        double valorParcelas = totalComJuros / qtdParcelas;

        System.out.println("Valor da Dívida Valor dos Juros Quantidade de Parcelas Valor da Parcela");
        for (int i = 1; i <= qtdParcelas; i++) {
            System.out.println("R$ " + totalComJuros + " " + juros + " " + i + " R$" + Double.valueOf(formato.format(valorParcelas)));
        }
    }
}
