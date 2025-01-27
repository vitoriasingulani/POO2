package exe1006;

public class Mediadois {
    private double a;
    private double b;
    private double c;

    public Mediadois(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getcalcular() {
        return (this.a * 2 + this.b * 3 + this.c * 5) / 10;
    }
}
