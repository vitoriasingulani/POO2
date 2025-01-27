package exe1018;


public class Cedulas {
    private int valor;
    private final int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
    private int[] quantidade;


    public Cedulas(int valor) {
        this.valor = valor;
        this.quantidade = new int[cedulas.length];
    }

    public void calcularNotas() {
        int restante = valor;

        for (int i = 0; i < cedulas.length; i++) {
            quantidade[i] = restante / cedulas[i];
            restante %= cedulas[i];
        }
    }

    public void exibirNotas() {
        for (int i = 0; i < cedulas.length; i++) {
            System.out.printf("%d nota(s) de R$ %d,00%n", quantidade[i], cedulas[i]);
        }
    }
}
