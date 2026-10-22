package AT10;

public class EntregaCaminhao extends Entrega implements Rastreavel {

    public EntregaCaminhao(String codigo, double distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularFrete() {
        return getDistanciaKm() * 5.0 + 30.00;
    }

    @Override
    public void rastrear() {
        System.out.println("A entrega por caminhão de código: " + getCodigo() + " está sendo rastreada");

    }
}
