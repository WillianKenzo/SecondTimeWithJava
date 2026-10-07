package AT02;

public class EntregaNacional extends Entrega {

    protected double distancia;

    @Override
    public double calcularValorFrete() {
        return distancia * 1.5;
    }

    public EntregaNacional(String CodigoPedido, double distancia) {
        super(CodigoPedido);
        this.distancia = distancia;
    }
}

