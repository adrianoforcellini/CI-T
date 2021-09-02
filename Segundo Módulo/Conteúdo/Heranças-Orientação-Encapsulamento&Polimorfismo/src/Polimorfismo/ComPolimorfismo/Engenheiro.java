package Polimorfismo.ComPolimorfismo;

class Engenheiro extends TipoDeEmpregado {
    int quantiaAPagar(Empregado emp) {
        return emp.lerSalarioMensal();
    }
}
