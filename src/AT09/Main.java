package AT09;

public class Main {
    public static void main(String[] args) throws Exception {

        CursoPresencial cpre1 = new CursoPresencial("Engenharia de software", 3200);
        CursoOnline co1 = new CursoOnline("Análise e Desenvolvimento de Software", 1800);

        System.out.println("==Curso presencial==");
        cpre1.exibirDados();
        System.out.println("Valor de inscrição: " + cpre1.calcularValor());
        cpre1.emitirCertificado("Willian");

        System.out.println();

        System.out.println("==Curso on-line==");
        co1.exibirDados();
        System.out.println("Valor de inscrição: " + co1.calcularValor());
        co1.emitirCertificado("Gustavo");
    }
}
