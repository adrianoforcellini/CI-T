import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayListExplore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // [ A ] declarando e instanciando uma agenda de contatos
        ArrayList<String> agenda = new ArrayList();
        // [ B ] usando o método add() para gravar 4 contatos na agenda
        agenda.add("Juca Bala;11 1111-1111");
        agenda.add("Marcos Paqueta;22 2222-2222");
        agenda.add("Maria Antonieta;33 3333-3333");
        agenda.add("Antônio Conselheiro;44 4444-4444");

        int num = 0;
        boolean sair = false;
        boolean go = true;

        System.out.printf("\nInforme a posição a ser excluída:\n");
        try {
            num = scan.nextInt();

        } catch (InputMismatchException ex) {
            System.out.println("You entered bad data.");
            System.out.println("Run the program again,");
            System.out.println("And enter an INTEGER.");
            ex.getMessage();
            go = false;
        }
        if (go) {
            try {
                agenda.remove(num);
            } catch (IndexOutOfBoundsException e) {
                System.out.printf("\nErro: posição inválida (%s).",
                        e.getMessage());
            }

            System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
            int i = 0;
            for (String contato : agenda) {
                System.out.printf("Posição %d- %s\n", i, contato);
                i++;
            }

            System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
            i = 0;
            Iterator<String> iterator = agenda.iterator();
            while (iterator.hasNext()) {
                System.out.printf("Posição %d- %s\n", i, iterator.next());
                i++;
            }
        }
    }
}