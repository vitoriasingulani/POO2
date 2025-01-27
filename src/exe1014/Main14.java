package exe1014;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a Distância: ");
        int distancia = scanner.nextInt();

        System.out.println("Digite a quantidade de litro gasto: ");
        double combustivel =scanner.nextDouble();

        Consumo consumo = new Consumo(distancia, combustivel);

        System.out.println("Consumo médio de: " + String.format("%.3f", consumo.getcalcularconsumo()));
    }
}
