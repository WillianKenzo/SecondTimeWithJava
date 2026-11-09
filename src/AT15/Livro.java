package AT15;

public class Livro extends MaterialBiblioteca implements Emprestavel{

    private boolean emprestado = false;

    public Livro(String codigo, String titulo, boolean emprestado) {
        super(codigo, titulo);
        this.emprestado = emprestado;
    }

    @Override
    public void emprestar() {
        if(emprestado) {
            throw new IllegalStateException("O livro já está emprestado!");
        }
        emprestado = true;
    }

    @Override
    public void devolver() {
        if(!emprestado) {
            throw new IllegalStateException("O livro não está emprestado!");
        }
        emprestado = false;
    }

    @Override
    public void exibirSituacao() {
        if(emprestado) {
            System.out.println("Emprestado");
        } else {
            System.out.println("Disponível");
        }
    }
}
