package exe1011;

public class Esfera {
    private double raio;
    private final double PI = 3.14159; // Isso é uma constante privada exclusiva da classe Esfera que representa ovalor de PI

    public Esfera(double raio){
        this.raio = raio;
    }

    public double getVolume(){
        return (4.0 / 3.0) * PI * Math.pow(raio,3); // <Math.pow(raio,3)> Eleva o raio ao cubo (raio³)
    }


}
