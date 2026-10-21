package AT09;

public class CursoOnline extends Curso implements Certificavel {

    public CursoOnline(String nome, int cargaHoraria) throws Exception {
        super(nome, cargaHoraria);
    }

    @Override
    public double calcularValor() {
        return getCargaHoraria() * 15.00;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Certificado curso on-line do aluno " + nomeAluno + " emitido");
    }
}
