package LacoRepeticao;

import java.text.DecimalFormat;

public class Q30 {

    /**
     * O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
     * implantar a metodologia da tabelinha, que já é um sucesso na sua loja de
     * 1,99. Você foi contratado para desenvolver o programa que monta a tabela
     * de preços de pães, de 1 até 50 pães, a partir do preço do pão informado
     * pelo usuário, conforme o exemplo abaixo: Preço do pão: R$ 0.18
     * Panificadora Pão de Ontem - Tabela de preços 1 - R$ 0.18 2 - R$ 0.36 ...
     * 50 - R$ 9.00
     */
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");
        //System.out.println("Informe a QTD de itens comprados");
        //int qtdCDs = input.nextInt();
        float qtd[] = new float[50];
        float preco = (float) 0.18;

        System.out.println("Preço do pão: R$ 0.18\n"
                + "Panificadora Pão de Ontem - Tabela de preços");
        for (int i = 0; i < qtd.length; i++) {
            System.out.println((i + 1) + " - R$ " + Double.valueOf(formato.format(preco)));
            preco += (float) 0.18;
        }
    }

}
