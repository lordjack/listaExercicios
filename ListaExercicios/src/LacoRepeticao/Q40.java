package LacoRepeticao;

import java.util.Scanner;

public class Q40 {

    /**
     * Foi feita uma estatística em cinco cidades brasileiras para coletar dados
     * sobre acidentes de trânsito. Foram obtidos os seguintes dados: 
        a. Código da cidade;
        b. Número de veículos de passeio (em 1999);
        c. Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
        d. Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
        e. Qual a média de veículos nas cinco cidades juntas;
        f. Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numVeiculo, numAcidente, maior = 1, menor = 9999, media = 0,
         mediaCidadeMenor=0, maiorNumCidade = 1, menorNumCidade = 1,countGeral=0, countMenorCidade=0;
        int[] cidades = new int[5];

        for (int i = 0; i < cidades.length; i++) {
            System.out.println("Informe o códido da Cidade");
            cidades[i] = input.nextInt();
            System.out.println("Número de Veiculos");
            numVeiculo = input.nextInt();
            System.out.println("Número de acidentes");
            numAcidente = input.nextInt();

            if (maior < numAcidente) {
                maior = numAcidente;
                maiorNumCidade = cidades[i];
            }
            if (menor > numAcidente) {
                menor = numAcidente;
                menorNumCidade = cidades[i];
            }
            if(numVeiculo<=2000){
                mediaCidadeMenor+=maior;
                countMenorCidade++;
            }
            media += numVeiculo;
            countGeral++;
            System.out.println("Código da Cidade: "+cidades[i]);
            System.out.println("Número de veiculos da Cidade: "+numVeiculo);
            System.out.println("Número de acidentes de veiculos da Cidade: "+numAcidente+"\n");
        }
        System.out.println("\n--------------//--------------\nMaior número de acidentes de transito e na cidade: " + maiorNumCidade + " com " + maior);
        System.out.println("Menor número de acidentes de transito e na cidade: " + menorNumCidade + " com " + menor);
        System.out.println("Média de veiculos nas cincos cidades é: " + (media/countGeral));
        System.out.println("Média de acidentes nas cidades com até 2000 veiculos é: " + (mediaCidadeMenor/countMenorCidade));
    }

}
