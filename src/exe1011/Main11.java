package exe1011;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Raio da esfera: ");
        double raio = scanner.nextDouble();

        Esfera esfera = new Esfera(raio);

        System.out.println("Volume = " + String.format("%.3f", esfera.getVolume()));

    }
}
