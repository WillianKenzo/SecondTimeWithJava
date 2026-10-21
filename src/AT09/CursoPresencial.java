package AT09;

public class CursoPresencial extends Curso implements Certificavel {

    public CursoPresencial(String nome, int cargaHoraria) throws Exception {
        super(nome, cargaHoraria);
    }

    @Override
    public double calcularValor() {
        return getCargaHoraria() * 20.00 + 50.00;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Certificado curso presencial do aluno " + nomeAluno + " emitido");
    }
}
