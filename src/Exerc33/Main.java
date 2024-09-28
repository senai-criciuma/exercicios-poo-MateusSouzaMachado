package Exerc33;

public class Main {
    public static void main(String[] args) {

        ContaBancaria id000001 = new ContaBancaria();

        id000001.depositar(1000);
        id000001.sacar(500);
        id000001.sacar(600);
        System.out.println("Saldo atual: " + id000001.consultarSaldo());
        id000001.depositar(600);
        System.out.println("Saldo atual: " + id000001.consultarSaldo());

    }
}
