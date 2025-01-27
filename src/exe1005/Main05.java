package exe1005;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();


        Mediaum mediaum = new Mediaum(a, b);

        System.out.printf("MEDIA = %.5f\n", mediaum.calcularMedia());

    }
}

