package LacoRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q31 {

    /**
     * O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de
     * 1,99 e agora possui uma loja de conveniências. Faça um programa que
     * implemente uma caixa registradora rudimentar. O programa deverá receber
     * um número desconhecido de valores referentes aos preços das mercadorias.
     * Um valor zero deve ser informado pelo operador para indicar o final da
     * compra. O programa deve então mostrar o total da compra e perguntar o
     * valor em dinheiro que o cliente forneceu, para então calcular e mostrar o
     * valor do troco. Após esta operação, o programa deverá voltar ao ponto
     * inicial, para registrar a próxima compra. A saída deve ser conforme o
     * exemplo abaixo: 
            * Lojas Tabajara 
            * Produto 1: R$ 2.20 
            * Produto 2: R$ 5.80
            * Produto 3: R$ 0 
            * Total: R$ 9.00 
            * Dinheiro: R$ 20.00 
            * Troco: R$ 11.00 ...
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");

        float produto=-1,soma=1,valorPago=0;
        int count=0;

        System.out.println("Lojas Tabajara");
        while(produto !=0){
            count++;
            System.out.print("Produto " + count+": R$ ");
            produto = input.nextFloat();
            soma+=produto;
        }
        System.out.println("Total: R$ "+Double.valueOf(formato.format(soma)));
        System.out.print("Dinheiro: R$ ");
        valorPago = input.nextFloat();
        
        System.out.println("Troco: R$ "+Double.valueOf(formato.format(valorPago-soma)));
        

    }

}
