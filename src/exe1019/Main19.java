package exe1019;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo: ");
        int segundos = scanner.nextInt();

        Tempo tempo = new Tempo(segundos);
        tempo.imprimirTempo();

        System.out.println("");

    }
}
