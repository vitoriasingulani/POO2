package exe1012;

public class Area {
    private double A;
    private double B;
    private double C;
    private final double PI = 3.14159;


    public Area(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;

    }

    public double getareaTriangulo(){
        return  (A * C) / 2;
    }

    public double getareaCirculo(){
        return PI * Math.pow(C, 2); // bom para nao precisar declarar nem inicializar outra variável
    }

    public double getareaTrapezio(){
        return ((A + B) * C) / 2;
    }

    public double getareaQuadrado(){
        return Math.pow(B,2);
    }

    public double getareaRetangulo(){
        return A * B;
    }
}
