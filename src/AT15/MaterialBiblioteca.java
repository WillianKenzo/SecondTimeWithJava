package AT15;

public abstract class MaterialBiblioteca {

    private final String codigo;
    private final String titulo;

    public MaterialBiblioteca(String codigo, String titulo) {
        if(codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser vazio");
        }
        this.codigo = codigo;
        if(titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser vazio");
        }
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void exibirDados() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Código do livro: " + codigo);
    }

    public abstract void exibirSituacao();
}
