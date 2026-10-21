package AT09;

public abstract class Curso {

    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) throws Exception {
        this.nome = nome;
        if(cargaHoraria <= 0) {
            throw new Exception("O curso não pode ter 0 horas");
        } else {
            this.cargaHoraria = cargaHoraria;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Nome do curso: " + nome);
        System.out.println("Carga horária do curso: " + cargaHoraria);
    }

    public abstract double calcularValor();

}
