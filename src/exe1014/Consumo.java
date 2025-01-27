package exe1014;

public class Consumo {
    private int distancia;
    private double combustivel;

    public Consumo (int distancia, double combustivel){
        this.distancia = distancia;
        this.combustivel = combustivel;
    }

    public double getcalcularconsumo() {
        return distancia / combustivel;
    }
}
