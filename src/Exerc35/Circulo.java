package Exerc35;

public class Circulo implements FormaGeometrica {

    @Override
    public double calcularArea(double raio) {
        double area = Math.PI * Math.pow(raio,2);
        return area;
    }

    @Override
    public double calcularPerimetro(double raio) {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
}
