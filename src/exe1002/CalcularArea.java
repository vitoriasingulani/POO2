package exe1002;

public class CalcularArea {
    private double raio;
    private final double PI = 3.14159;


    public CalcularArea(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * Math.pow(raio, 2);
    }
}
