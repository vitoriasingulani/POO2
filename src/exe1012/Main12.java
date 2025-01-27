package exe1012;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o PRIMEIRO valor: ");
        double A = scanner.nextDouble();

        System.out.println("Digite o SEGUNDO valor: ");
        double B = scanner.nextDouble();

        System.out.println("Digite o TERCEIRO valor: ");
        double C = scanner.nextDouble();

        Area area = new Area(A,B, C);


        System.out.println("TRIANGULO: " + String.format("%.3f", area.getareaTriangulo()));
        System.out.println("CIRCULO: " + String.format("%.3f", area.getareaCirculo()));
        System.out.println("TRAPEZIO: " + String.format("%.3f", area.getareaTrapezio()));
        System.out.println("QUADRADO: " + String.format ("%.3f", area.getareaQuadrado()));
        System.out.println("RETANGULO: " + String.format("%.3f", area.getareaRetangulo()));
    }
}
