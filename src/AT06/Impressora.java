package AT06;

public class Impressora implements Conectavel {
    private String modelo;

    public Impressora(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void conectar() {
        System.out.println("A impressora de modelo " + modelo + " foi conectada por cabo USB");
    }

    @Override
    public void desconectar() {
        System.out.println("A impresssora de modelo " + modelo + " foi desconectada.");
    }
}
