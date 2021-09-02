package Polimorfismo.ComPolimorfismo;

class Empregado {
    int quantiaAPagar() {
        return _tipo.quantiaAPagar(this);
    }
}

// Essa classe que vai chamar o TipoDeEmpregado dependendo do tipo passado