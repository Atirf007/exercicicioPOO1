public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Felipe", "Silva", -2000);
        Funcionario f2 = new Funcionario("Maria", "Soares", 5000);

        System.out.printf("\nSalário anual de %s %s: %.2f", f1.getNome(), f1.getSobrenome(), f1.calcularSalarioAnual());
        System.out.printf("\nSalário anual de %s %s: %.2f", f2.getNome(), f2.getSobrenome(), f2.calcularSalarioAnual());

        System.out.printf("\n\nNovo salário anual de %s %s: %.2f", f1.getNome(), f1.getSobrenome(), f1.calcularSalarioAnual());
        System.out.printf("\nNovo salário anual de %s %s: %.2f", f2.getNome(), f2.getSobrenome(), f2.calcularSalarioAnual());
    }
}
