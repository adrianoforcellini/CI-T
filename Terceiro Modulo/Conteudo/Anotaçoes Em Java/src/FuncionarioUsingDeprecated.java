public class FuncionarioUsingDeprecated {
    protected double salario;

    @Deprecated
    public double getSalarioTotal
            (double bonus) {
        return this.salario + bonus;
    }

    public double getTotalSalario
            (double bonus) {
        return this.salario + bonus;
    }
}
