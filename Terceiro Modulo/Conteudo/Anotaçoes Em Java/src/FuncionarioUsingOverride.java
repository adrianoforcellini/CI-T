public class FuncionarioUsingOverride {
    protected double salario;

    public double getSalarioTotal(double bonus) {
        return this.salario + bonus;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Funcionario [salario=");
        builder.append(salario);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(salario);
        result = prime * result + (int)
                (temp ^ (temp >>> 32));
        return result;
    }

}

// O leitor pode perguntar por que simplesmente não removemos o método obsoleto.
// E a resposta é que precisamos manter a compatibilidade com sistemas legados que usam a classe.
// Ou seja, mesmo implementando uma nova versão de um método, os sistemas que já existem precisam
// continuar funcionando. Os programadores serão então alertados da mudança e gradativamente
// irão modificando suas aplicações para se adaptar à nova versão da classe.