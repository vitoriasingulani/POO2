package exe1013;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = scanner.nextInt();

        Maior maior = new Maior(A, B, C);

        System.out.println("O MAIOR Numero é: " + maior.getMaior());

    }
}
