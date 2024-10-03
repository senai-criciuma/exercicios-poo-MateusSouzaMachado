package Exerc42;

public class Circulo extends FiguraGeometrica{

    @Override
    public double calcularArea(double raio) {
        this.setArea(Math.PI * Math.pow(raio,2));
        return this.getArea();
    }


}
