package exe1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        Soma soma = new Soma(A, B);

        System.out.println("X = " + soma.getResultado());

        scanner.close();
    }
}
