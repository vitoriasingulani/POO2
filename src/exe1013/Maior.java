package exe1013;

public class Maior {
    private int A;
    private int B;
    private int C;

    public Maior(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int getMaior() {
        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        return (maiorAB + C + Math.abs(maiorAB - C)) / 2;
    }
}