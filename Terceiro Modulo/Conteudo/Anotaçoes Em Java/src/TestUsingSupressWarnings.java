import java.util.*;

public class TestUsingSupressWarnings {
    @SuppressWarnings(value={"unchecked", "rawtypes"})
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("dado");
    }

}

// Aplicações criadas antes do advento do Java 5 podem ter algum código que gera alertas
// (warnings) durante a compilação com esta versão ou posteriores.

// Contudo, ignorar todos os alertas em uma aplicação pode não ser uma boa decisão. Sendo assim, como devemos tratar essa situação?
//
//A resposta está no uso da anotação @SuppressWarnings, que permite desligar os alertas de uma parte do
// código da aplicação – classe, método ou inicialização de variável ou campo –
// e os warnings do restante do código permanecem inalterados.