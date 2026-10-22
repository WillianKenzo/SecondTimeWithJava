package AT10;

public abstract class Entrega {

    private String codigo;
    private double distanciaKm;

    public Entrega(String codigo, double distanciaKm) {
        this.codigo = codigo;
        if(distanciaKm <= 0) {
            throw new IllegalArgumentException("A distância deve ser positiva");
        }
        this.distanciaKm = distanciaKm;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public void exibirDados() {
        System.out.println("Código da entrega: " + codigo);
        System.out.println("Distância: " + distanciaKm + " km");
    }

    public abstract double calcularFrete();
}
