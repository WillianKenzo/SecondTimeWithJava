package AT10;

public class Main {
    public static void main(String[] args) {

        EntregaBicicleta b1 = new EntregaBicicleta("XOKLAJOIE67", 5.0);
        EntregaCaminhao c1 = new EntregaCaminhao("IPQJUWIEQ67", 20);

        System.out.println("===ENTREGA POR BICICLETA===");
        b1.exibirDados();
        System.out.println("Frete: " + b1.calcularFrete());
        b1.rastrear();

        System.out.println();

        System.out.println("===ENTREGA POR CAMINHÃO===");
        c1.exibirDados();
        System.out.println("Frete: " + c1.calcularFrete());
        c1.rastrear();
    }
}
