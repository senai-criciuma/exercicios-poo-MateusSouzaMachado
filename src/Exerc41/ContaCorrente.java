package Exerc41;

public class ContaCorrente extends ContaBancaria{

    private double saldoLimite = 500;


    public double getSaldoLimite() {
        return this.saldoLimite;
    }

    public void setSaldoLimite(double saldoLimite) {
        this.saldoLimite = saldoLimite;
    }

    @Override
    public void setNumeroDaConta(int numeroDaConta) {
        super.setNumeroDaConta(numeroDaConta);
    }

    @Override
    public int getNumeroDaConta() {
        return super.getNumeroDaConta();
    }

    @Override
    public String getTitular() {
        return super.getTitular();
    }

    @Override
    public void setTitular(String titular) {
        super.setTitular(titular);
    }

}
