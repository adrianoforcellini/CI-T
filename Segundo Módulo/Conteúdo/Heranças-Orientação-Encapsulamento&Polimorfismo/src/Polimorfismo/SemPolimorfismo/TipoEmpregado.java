package Polimorfismo.SemPolimorfismo;


public class TipoEmpregado {
    public int quantiaAPagar() {
        switch (lerTipo()) {
            case TipoDeEmpregado.ENGENHEIRO:
                return _salarioMensal;
            case TipoDeEmpregado.VENDEDOR:
                return _salarioMensal + _comissao;
            case TipoDeEmpregado.GERENTE:
                return _salarioMensal + _bonus;
            default:
                throw new RuntimeException("tipo incorreto de empregado");
        }
    }


}