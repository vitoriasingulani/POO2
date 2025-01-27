package exe1017;
import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem em hrs: ");
        int tempo = scanner.nextInt();

        System.out.println("Digite a velocidade média de km/h: ");
        int velocidade = scanner.nextInt();

        GastoCombustivel gastocombustivel = new GastoCombustivel(tempo, velocidade);

        System.out.printf("Combustível necessário: " + String.format("%.3f", gastocombustivel.getGastoCombustivel()) + " litros.");

    }
}
