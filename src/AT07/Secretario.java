package AT07;

public class Secretario extends Funcionario implements Registravel {

    protected double salarioMensal;

    public Secretario(String nome, String matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("O secretário está presente.");
    }

}
