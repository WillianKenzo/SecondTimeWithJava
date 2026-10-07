package AT02;

public abstract class Entrega {

    protected String CodigoPedido;

    public Entrega(String CodigoPedido) {
        this.CodigoPedido = CodigoPedido;
    }

    public abstract double calcularValorFrete();

    public void exibirResumo() {
        System.out.println("Resumo da entrega");
        System.out.println("Codigo pedido: " + CodigoPedido);
        System.out.println("Valor do frete: R$ " + calcularValorFrete());
        System.out.println("_____________\n");
    }
}
