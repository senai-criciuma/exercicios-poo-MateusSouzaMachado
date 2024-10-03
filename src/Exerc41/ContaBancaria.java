package Exerc41;

public abstract class ContaBancaria {

    private int numeroDaConta;
    private String titular;
    private double saldo;


    public double depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
        return this.saldo;
    }
    public double sacar(double valor){
        if (valor > 0 && valor < this.saldo){
            this.saldo -= this.saldo;
        }else {
            System.out.println("Saldo insuficiente");
        }
        return this.saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


}
