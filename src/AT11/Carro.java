package AT11;

public class Carro extends Veiculo implements Operavel{

    private int quantidadePortas;

    public Carro(String placa, String modelo, double valorBaseDiaria, int quantidadePortas) throws Exception {
        super(placa, modelo, valorBaseDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public double calcularDiaria() {
        double valorFinal = getValorBaseDiaria() + 50.00;
        return valorFinal;
    }

    @Override
    public void ligar() {
        System.out.println("Vrummm!! Tá ligado o carango.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligaram o carango.");
    }
}
