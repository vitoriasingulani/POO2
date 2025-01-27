package exe1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();

        CalcularArea calculadora = new CalcularArea(raio);

        System.out.printf("A=%.4f%n", calculadora.calcularArea());
        scanner.close();
    }
}
