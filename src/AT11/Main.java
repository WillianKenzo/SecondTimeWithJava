package AT11;

public class Main {
    public static void main(String[] args) throws Exception {

        Carro c1 = new Carro("ABC1D23", "Onix", 100.00, 4);
        Moto m1 = new Moto("XYZ9A87", "CG 160", 60.00, 160);

        System.out.println("==CARRO==");
        c1.exibirDados();
        System.out.println("Portas: " + c1.getQuantidadePortas());
        System.out.printf("Locação por 3 dias: R$ %.2f%n" , c1.calcularLocacao(3));

        System.out.println();

        System.out.println("==MOTO==");
        m1.exibirDados();
        System.out.println("Cilindradas: " + m1.getCilindradas());
        System.out.printf("Locação por 3 dias: R$ %.2f%n" , m1.calcularLocacao(3));

        System.out.println();

        System.out.println("==OPERAÇÕES==");
        c1.ligar();
        c1.desligar();
        m1.ligar();
        m1.desligar();

        System.out.println();

        System.out.println("Quantidade de veículos criados: " + Veiculo.getTotalVeiculos());
    }
}
