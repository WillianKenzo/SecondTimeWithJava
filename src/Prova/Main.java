package Prova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Catalogo<Curso> catalogo = new Catalogo<>();

        int ead = 0;
        int presencial = 0;
        int cursosCadastrados = 0;

        while (true) {
            try {
                System.out.println("\n1 - Cadastrar curso EAD");
                System.out.println("2 - Cadastrar curso presencial");
                System.out.println("0 - Encerrar cadastro");
                System.out.println("Opção: ");

                int opcao = sc.nextInt();
                sc.nextLine();

                if (opcao == 0) {
                    break;
                }

                if (opcao != 1 && opcao != 2) {
                    System.out.println("Opção inválida!");
                    continue;
                }

                System.out.println("Nome do curso:");
                String nome = sc.nextLine();

                System.out.println("Carga horária:");
                int cargaHoraria = sc.nextInt();

                System.out.println("Nível do curso:");
                System.out.println("1 - Básico");
                System.out.println("2 - Avançado");
                int opcaoNivel = sc.nextInt();
                sc.nextLine();

                Nivel nivel = null;

                switch (opcaoNivel) {
                    case 1:
                        nivel = Nivel.BASICO;
                        break;
                    case 2:
                        nivel = Nivel.AVANCADO;
                        break;
                    default:
                        System.out.println("Nível inválido!");
                        break;
                }

                if (nivel != null) {

                    try {
                        switch (opcao) {
                            case 1:
                                CursoEAD cursoEAD = new CursoEAD(nome, cargaHoraria, nivel);
                                catalogo.adicionar(cursoEAD);

                                System.out.println("Curso EAD cadastrado com sucesso!");

                                ead++;
                                cursosCadastrados++;
                                break;

                            case 2:
                                CursoPresencial cursoPresencial = new CursoPresencial(nome, cargaHoraria, nivel);
                                catalogo.adicionar(cursoPresencial);

                                System.out.println("Curso presencial cadastrado com sucesso!");

                                presencial++;
                                cursosCadastrados++;
                                break;
                        }

                    } catch (Exception e) {
                        System.out.println("Erro no cadastro: " + e.getMessage());
                    }
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida! Tente novamente.");
                sc.nextLine();
            }
        }

        System.out.println("\nCadastro finalizado!");

        if (catalogo.getCatalogo().isEmpty()) {
            System.out.println("Nenhum curso cadastrado!");
        } else {

            System.out.println("\nDados:");

            for (Curso c : catalogo.getCatalogo()) {
                c.exibirDados();
                c.iniciar();
                System.out.println();
            }

            System.out.println("\nCursos de nível avançado:");

            for (Curso c : catalogo.getCatalogo()) {
                if (c.getNivel() == Nivel.AVANCADO) {
                    System.out.println(c.getNome());
                }
            }
        }

        System.out.println("\nTotal:");
        System.out.println("Cursos EAD: " + ead);
        System.out.println("Cursos presenciais: " + presencial);
        System.out.println("Total geral: " + cursosCadastrados);

        sc.close();
    }
}
