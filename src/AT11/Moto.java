package AT11;

public class Moto extends Veiculo implements Operavel {

    private int cilindradas;

    public Moto(String placa, String modelo, double valorBaseDiaria, int cilindradas) throws Exception {
        super(placa, modelo, valorBaseDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularDiaria() {
        double valorFinal = getValorBaseDiaria() + 20.00;
        return valorFinal;
    }

    @Override
    public void ligar() {
        System.out.println("Rantantan!! Tá ligado a motoca.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligaram a motoca.");
    }
}
