package Polimorfismo.ComPolimorfismo;

class Vendedor extends TipoDeEmpregado {
    int quantiaAPagar(Empregado emp) {
        return emp.lerSalarioMensal() + emp.lerComissao();
    }
}