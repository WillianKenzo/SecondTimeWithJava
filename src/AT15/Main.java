package AT15;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("FALLEN67", "Jogador numero 1", false);

        Emprestavel e = livro;

        livro.exibirSituacao();

        try {
            e.emprestar();
        } catch(IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            livro.exibirSituacao();
        }

        try {
            e.emprestar();
        } catch(IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            livro.exibirSituacao();
        }

        try {
            e.devolver();
        } catch(IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            livro.exibirSituacao();
        }

        try {
            e.devolver();
        } catch(IllegalStateException ex) {
            System.out.println(ex.getMessage());
        } finally {
            livro.exibirSituacao();
        }
    }
}