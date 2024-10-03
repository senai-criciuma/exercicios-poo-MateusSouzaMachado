package Exerc42;

public class Retangulo extends FiguraGeometrica{

    private double area;
    private double perimetro;

    @Override
    public double calcularPerimetro(double base, double altura) {
        this.perimetro = 2 * (base + altura);
        return this.perimetro;
    }
}
