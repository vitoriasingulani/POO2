package exe1008;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int qntdfuncionario = scanner.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horastrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor recebido por hora: ");
        double valorporhora = scanner.nextDouble();


        Salario salario = new Salario(horastrabalhadas, valorporhora);

        //tem algo de errado na impressao nos resultados!!!!
        System.out.println("Numero de Funcionários = " + qntdfuncionario);
        System.out.println("Salario = R$ " + String.format("%.2f", salario.getcalcularsalario()));

    }
}