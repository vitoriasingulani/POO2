package exe1004;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ProdutoSimples produtosimples = new ProdutoSimples(a, b);
        System.out.println("PROD = " + produtosimples.getResultado());

    }
}