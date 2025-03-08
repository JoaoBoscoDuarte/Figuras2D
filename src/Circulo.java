public class Circulo implements FiguraGeometrica2D{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * getRaio() * getRaio();
    }

    public double getPerimetro() {
        return 2 * Math.PI * getRaio();
    }

    public String getTipoFigura() {
        return "Círculo";
    }
}
