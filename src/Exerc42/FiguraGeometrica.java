package Exerc42;

public abstract class FiguraGeometrica {

   private double area;

    public abstract double calcularArea(double raio);

    public abstract double calcularArea();


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
