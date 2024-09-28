package Exerc35;

public class Quadrado implements FormaGeometrica {

    @Override
    public double calcularPerimetro(double raio) {
        double area = 4 * raio;
        return raio;
    }

    @Override
    public double calcularArea(double raio) {
        double area = raio * 2;
        return raio;
    }
}
