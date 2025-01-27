package exe1003;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        SomaSimples somasimples = new SomaSimples (A, B);

        System.out.println("X = " + somasimples.getResultado());
    }
}
