package AT02;

public class EntregaLocal extends Entrega{
    @Override
    public double calcularValorFrete() {
        return 10.00;
    }

    public EntregaLocal(String CodigoPedido) {
        super(CodigoPedido);
    }
}
