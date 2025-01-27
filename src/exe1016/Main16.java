package exe1016;
import  java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quilometragem:  ");

        int distancia = scanner.nextInt();

        Carro carro = new Carro();

        System.out.println(carro.getcalcularTempo(distancia) + " minutos");

    }
}
