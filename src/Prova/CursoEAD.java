package Prova;

public class CursoEAD extends Curso {

    public CursoEAD(String nome, int cargaHoraria, Nivel nivel) {
        super(nome, cargaHoraria, nivel);
    }

    @Override
    public void iniciar() {
        System.out.println("O acesso ao curso será feito pela plataforma.");
    }
}
