package Exerc33;

public class ContaBancaria {

    private int numeroDaConta;
    private String titular;
    private double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }

    public double sacar(double valor){
        if (valor < this.saldo ){
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
        return this.saldo;
    }

    public double consultarSaldo(){
        return this.saldo;
    }
}
