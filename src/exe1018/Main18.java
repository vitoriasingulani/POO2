package exe1018;
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inteiro:");
        int valor = scanner.nextInt();

        Cedulas cedulas = new Cedulas(valor);
        cedulas.calcularNotas();

        System.out.println("Valor: " + valor);
        cedulas.exibirNotas();

    }
}
