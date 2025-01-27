package exe1007;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        Diferenca diferenca = new Diferenca(a, b, c, d);

        System.out.println("DIFERENCA = " + diferenca.getcalcularDiferenca());

    }
}