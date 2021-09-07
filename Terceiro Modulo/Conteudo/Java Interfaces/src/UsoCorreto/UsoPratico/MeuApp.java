package UsoCorreto.UsoPratico;

public class MeuApp {

    private static Object Funcionario001;

    public static void main(String[] args) {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

        if (funcionarioDAO instanceof BasicoDAO) {
            funcionarioDAO.salvar(Funcionario001);
        } else {
            System.err.println("A Classe FuncionarioDAO não implementa BasicoDAO, nenhum procedimento foi realizado");

        }
    }


    public long calculaSalarioDeFuncionario(Funcionario funcionario) {

        if (funcionario instanceof Gerente) {
            return 15550;
        } else if (funcionario instanceof Coordenador) {
            return 10700;
        } else if (funcionario instanceof Operador) {
            return 6300;
        }
        return 0;
    }

}