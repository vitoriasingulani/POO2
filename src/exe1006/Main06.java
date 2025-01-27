package exe1006;
import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        Mediadois mediadois = new Mediadois(a, b, c);

        System.out.printf("MEDIA = %.1f\n", mediadois.getcalcular());
    }
}
