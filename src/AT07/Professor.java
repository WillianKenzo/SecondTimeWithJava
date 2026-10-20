package AT07;

public class Professor extends Funcionario implements Registravel {

    protected int quantidadeHoras;
    protected double valorHora;

    public Professor(String nome, String matricula, int quantidadeHoras, double valorHora) {
        super(nome, matricula);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        double salario = quantidadeHoras * valorHora;
        return salario;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("O professor está presente.");
    }
}
