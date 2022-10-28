package model;

public class Conta {
    private double saldo;
    private double taxa=0.01;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposito(double valor) {
        this.saldo = saldo + (valor-valor*(taxa/100));
    }
    public void saca(double valor) {
        this.saldo = saldo - (valor+valor*(taxa/100));
    }

    public double getTaxa() {
        return taxa;
    }

    public void atualiza(double taxa) {
        this.taxa = taxa;
    }
}
