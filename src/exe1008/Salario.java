package exe1008;

public class Salario {
    private int horastrabalhadas;
    private double valorporhora;


    public Salario(int horastrabalhadas, double valorporhora) {
        this.horastrabalhadas = horastrabalhadas;
        this.valorporhora = valorporhora;
    }


    public double getcalcularsalario() {
        return this.horastrabalhadas * this.valorporhora;
    }
}