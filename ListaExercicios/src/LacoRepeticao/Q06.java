package LacoRepeticao;

public class Q06 {

    /**
     * Faça um programa que imprima na tela os números de 1 a 20, um abaixo do
     * outro. Depois modifique o programa para que ele mostre os números um ao
     * lado do outro
     */
    public static void main(String[] args) {
        System.out.println("Sequencias de Números um abaixo do outro");
        System.out.println("Número");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("Sequencias de Números um ao lado do outro");
        System.out.print("Número ");
        for (int i = 0; i <= 20; i++) {
            if (i == 20) {
                System.out.print(" e " + i);
            } else if (i == 0) {
                System.out.print(i);
            } else {
                System.out.print(", " + i);
            }
        }
    }

}
