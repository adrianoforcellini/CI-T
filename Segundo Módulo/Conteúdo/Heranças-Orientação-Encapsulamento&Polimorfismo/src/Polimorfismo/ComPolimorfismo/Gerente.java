package Polimorfismo.ComPolimorfismo;

class Gerente extends TipoDeEmpregado {
    int quantiaAPagar(Empregado emp) {
        return emp.lerSalarioMensal() + emp.lerBonus();
    }
}