package exe1009;

public class SalarioBonus {
    private double salario;
    private double totalvendas;

    public SalarioBonus(double salario, double totalvendas) {
        this.salario = salario;
        this.totalvendas = totalvendas;
    }

    public double getCalcularSalarioBonus() {;
        double comissao = totalvendas * 0.15;
        return salario + comissao;
    }
}