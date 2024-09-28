package Exerc31;

public class Cachorro {

    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.idade = idade;
        this.nome = nome;
        this.raca = raca;
    }

    public String latir(){
        return String.format("au au au au!!!!");
    }

    public String correr(){
        return String.format("O cahorro esta correndo");
    }

    public String comer(){
        return String.format("Nham nham");
    }
}
