package Exerc32;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int acelerar(int velocidade){
        this.velocidade += velocidade;
        return this.velocidade;
    }
    public int frear(int velocidade){
        this.velocidade -= velocidade;
        return this.velocidade;
    }
    public int darRe(int velocidade){
        this.velocidade = 0 - velocidade;
        return this.velocidade;
    }

}
