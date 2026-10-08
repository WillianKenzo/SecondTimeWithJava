package AT03;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    void atacar() {
        System.out.println("Golpe de espada!!");
    }
}
