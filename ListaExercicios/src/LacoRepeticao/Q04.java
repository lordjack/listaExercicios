package LacoRepeticao;

public class Q04 {

    /**
     * 4.Supondo que a população de um país A seja da ordem de 80000 habitantes
     * com uma taxa anual de crescimento de 3% e que a população de B seja
     * 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa
     * que calcule e escreva o número de anos necessários para que a população
     * do país A ultrapasse ou iguale a população do país B, mantidas as taxas
     * de crescimento.
     *
     */
    public static void main(String[] args) {
        float p1 = 80000, p2 = 200000;
        int ano = 0;

        for (int i = 1; p1 <= p2; i++) {
            p1 = (float) (p1 + (p1 * 0.03));
            p2 = (float) (p2 + (p2 * 0.015));
            ano = i;
        }
        System.out.println("A qtd de anos será: " + ano);
    }

}
