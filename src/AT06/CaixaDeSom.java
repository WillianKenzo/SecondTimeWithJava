package AT06;

public class CaixaDeSom implements Conectavel {

    private String nome;

    public CaixaDeSom(String nome) {
        this.nome = nome;
    }

    @Override
    public void conectar() {
        System.out.println("A caixa de som de nome " + nome + " foi conectada por Bluetooth.");
    }

    @Override
    public void desconectar() {
        System.out.println("A caixa de som de nome " + nome + " foi desconectada.");
    }
}
