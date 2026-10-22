package AT11;

public abstract class Veiculo {

    private final String placa;
    private String modelo;
    private double valorBaseDiaria;
    private static int totalVeiculos;
    public static final String NOME_LOCADORA = "Kayden Veículos";

    public Veiculo(String placa, String modelo, double valorBaseDiaria) throws Exception {
        validarValorBaseDiaria(valorBaseDiaria);

        this.placa = placa;
        this.modelo = modelo;
        this.valorBaseDiaria = valorBaseDiaria;

        totalVeiculos++;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorBaseDiaria(double valorBaseDiaria) {
        this.valorBaseDiaria = valorBaseDiaria;
    }

    public abstract double calcularDiaria();

    public void exibirDados() {
        System.out.println("Locadora: " + NOME_LOCADORA);
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Modelo do veículo: " + modelo);
        System.out.printf("Valor da diária: R$ %.2f%n", calcularDiaria());
    }

    public double calcularLocacao(int dias) {
        if(dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias locados deve ser maior que zero.");
        }
        return dias * calcularDiaria();
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }

    private void validarValorBaseDiaria(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser maior que zero.");
        }
    }
}
