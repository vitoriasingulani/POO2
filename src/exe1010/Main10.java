package exe1010;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo da PRIMEIRA peça, o numero de peças desse codigo e o valor unitário de cada uma: ");
        int cod1 = scanner.nextInt();
        int qntd1 = scanner.nextInt();
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o codigo da SEGUNDA peça, o numero de peças desse codigo e o valor unitário de cada uma: ");
        int cod2 = scanner.nextInt();
        int qntd2 = scanner.nextInt();
        double valor2 = scanner.nextDouble();

        CalculoSimples calculosimples = new CalculoSimples(cod1, qntd1, valor1, cod2, qntd2, valor2);

        System.out.println("Valor a Pagar: R$ " + calculosimples.getcalculosimples());
    }
}