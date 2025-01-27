package exe1007;

public class Diferenca {
    private int a;
    private int b;
    private int c;
    private int d;

    public Diferenca(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public int getcalcularDiferenca() {
        return (this.a * this.b) - (this.c * this.d);
    }
}