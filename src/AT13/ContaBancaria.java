package AT13;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        if(titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular deve ser informado");
        }
        if(Double.isInfinite(saldo) || saldo < 0) {
            throw new IllegalArgumentException("O saldo inicial deve ser finito e não pode ser menor que zero");
        }
        this.titular = titular;
        this.saldo = saldo;


    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if(Double.isInfinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O saque deve ser valor finito e ou maior que zero.");
        }

        if(valor > saldo) {
            throw new SaldoInsuficienteException("O saldo é insuficiente");
    }
        saldo -= valor;


    }
}
