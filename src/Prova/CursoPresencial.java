package Prova;

public class CursoPresencial extends Curso {

    public CursoPresencial(String nome, int cargaHoraria, Nivel nivel) {
        super(nome, cargaHoraria, nivel);
    }

    @Override
    public void iniciar() {
        System.out.println("O curso será ministrado na instituição.");
    }
}
