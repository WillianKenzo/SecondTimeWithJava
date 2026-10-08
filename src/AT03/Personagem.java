package AT03;

public abstract class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    abstract void atacar();

    public void exibirStatus() {
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Nível do personagem: " + nivel);
    }
}
