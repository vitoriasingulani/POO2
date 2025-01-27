package exe1017;

public class GastoCombustivel {
    private int tempo;
    private int velocidade;
    private final double consumoporkm = 12.0;

    public GastoCombustivel(int tempo, int velocidade){
        this.tempo = tempo;
        this.velocidade = velocidade;
    }

    public double getGastoCombustivel(){
        int distancia = tempo * velocidade;
        return distancia / consumoporkm;
    }
}
