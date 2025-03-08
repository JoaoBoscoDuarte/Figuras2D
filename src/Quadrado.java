public class Quadrado implements FiguraGeometrica2D {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return getLado() * getLado();
    }

    public double getPerimetro() {
        return 4 * getLado();
    }

    public String getTipoFigura() {
        return "Quadrado";
    }
}
