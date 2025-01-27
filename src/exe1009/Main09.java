package exe1009;
import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de um vendedor: ");
        String vendedor = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas no mês");
        double totalvendas = scanner.nextDouble();

        SalarioBonus comissao = new SalarioBonus(salario, totalvendas);

        System.out.println("Vendedor: " + vendedor);
        System.out.println("Salario = R$ " + String.format("%.2f", comissao.getCalcularSalarioBonus()));
    }
}