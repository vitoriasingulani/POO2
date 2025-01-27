package exe1004;

public class ProdutoSimples {
    private int a;
    private int b;

    public ProdutoSimples(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getResultado() {
        return this.a * this.b;
    }
}