package AT03;

public class Mago extends Personagem{

    public Mago(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    void atacar() {
        System.out.println("Lança feitiço!!");
    }
}
