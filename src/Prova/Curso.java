package Prova;

public abstract class Curso implements Iniciavel {

    String nome;
    int cargaHoraria;
    Nivel nivel;

    public Curso(String nome, int cargaHoraria, Nivel nivel) {
        if(nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vázio.");
        }
        this.nome = nome;

        if(cargaHoraria <= 0) {
            throw new IllegalArgumentException("A carga horária deve ser maior que zero.");
        }
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void exibirDados() {
        System.out.println("Nome do curso;" + nome);
        System.out.println("Carga horária:" + cargaHoraria);
        System.out.println("Nível: " + nivel);
    }
}
