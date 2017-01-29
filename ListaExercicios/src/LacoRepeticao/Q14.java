package LacoRepeticao;

public class Q14 {

    /**
     * Faça um programa que peça 10 números inteiros, calcule e mostre a
     * quantidade de números pares e a quantidade de números impares.
     */
    public static void main(String[] args) {
        int par = 0, impar = 0;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Número Par: " + par + " Número Impar: " + impar);
    }

}
