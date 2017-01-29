package LacoRepeticao;

import java.util.Scanner;

/*
    Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
    mostrando uma mensagem de erro e voltando a pedir as informações.
 */
public class Q02 {

    public static void main(String[] args) {
        Scanner next = new Scanner(System.in);

        String nome, senha;

        do {
            System.out.println("Informe a Nome");
            nome = next.nextLine();
            System.out.println("Informe a Senha");
            senha = next.nextLine();
            if (nome.equals(senha) || senha.equals(nome)) {
                System.out.println("Erro tente novamente");
            }
        } while (nome.equals(senha)|| senha.equals(nome));

    }

}
