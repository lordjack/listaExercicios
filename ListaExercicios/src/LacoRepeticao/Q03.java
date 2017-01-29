package LacoRepeticao;

import java.util.Scanner;

/**
 * Faça um programa que leia e valide as seguintes informações: a. Nome: maior
 * que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que zero; d.
 * Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
 */
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome, sexo, estado;
        int idade;
        float salario;

        System.out.println("Informe o nome: ");
        nome = input.nextLine();
        
        System.out.println("Informe uma idade: ");
        idade = input.nextInt();
        
        System.out.println("Informe um salário: ");
        salario = input.nextFloat();
        
        System.out.println("Informe um Sexo: ");
        sexo = input.nextLine();
        
        System.out.println("Informe um Estado: ");
        estado = input.nextLine();
        
        if (nome.length() > 3) {
            System.out.println(nome + " O nome e maior que 3 caracteres");
        } else {
            System.out.println(nome + " O nome e menor que 3 caracteres");
        }

        if (idade > 0 && idade <= 150) {
            System.out.println(idade + " A Idade: entre 0 e 150");
        } else {
            System.out.println(idade + " A Idade não esta entre 0 e 150");
        }
        
        if (sexo.equals("m") || sexo.equals("f")) {
            System.out.println(sexo + " é valído");
        } else {
            System.out.println(sexo + " é invalído");
        }

        if (salario > 0) {
            System.out.println(salario + " Salario é valído");
        } else {
            System.out.println(salario + " Salario é invalído");
        }
        
        if (estado.equals("s") || estado.equals("c") || estado.equals("v") || estado.equals("d")) {
            System.out.println(estado + " Estado é valído");
        } else {
            System.out.println(estado + " Estado é invalído");
        }

    }

}
