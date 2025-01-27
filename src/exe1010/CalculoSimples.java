package exe1010;

public class CalculoSimples {
    private int cod1;
    private int qntd1;
    private double valor1;
    private int cod2;
    private int qntd2;
    private double valor2;

    public CalculoSimples(int cod1, int qntd1, double valor1, int cod2, int qntd2, double valor2){
        this.cod1 = cod1;
        this.qntd1 = qntd1;
        this.valor1 = valor1;
        this.cod2 = cod2;
        this.qntd2 = qntd2;
        this.valor2 = valor2;
    }

    public double getcalculosimples(){
        return (qntd1 * valor1) + (qntd2 * valor2);
    }

}
