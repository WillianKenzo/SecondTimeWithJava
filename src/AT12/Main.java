package AT12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade do aluno: ");
        String idadeTexto = sc.nextLine();

        try {
            int idade = Integer.parseInt(idadeTexto);

            Aluno aluno = new Aluno(nome, idade);
            aluno.exibirDados();

        } catch (NumberFormatException e) {
            System.out.println("Idade inválida! Digite um número inteiro.");

        } finally {
            System.out.println("Tentativa de cadastro finalizada.");
        }

        sc.close();
    }
}
