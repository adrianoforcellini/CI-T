// public interface Criptografia {

//     String criptografar(String texto);

//     String descriptografar(String texto);
// }

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if (texto.equals("")) {
            throw new IllegalArgumentException("O texto não pode estar em branco");
        }
        char[] ArrayAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ArrayToCode = texto.toLowerCase().toCharArray();

        ArrayList<Character> ListAlphabet = new ArrayList<>();
        ArrayList<Character> ListToCode = new ArrayList<>();
        ArrayList<Character> ListOutput = new ArrayList<>();

        for (Character a : ArrayAlphabet) {
            ListAlphabet.add(a);
        }

        for (Character a : ArrayToCode) {
            ListToCode.add(a);
        }

        for (Character a : ArrayToCode) {
            if (ListAlphabet.indexOf(a) != -1) {
                ListOutput.add(ListAlphabet.get(ListAlphabet.indexOf(a) + 3));
            } else {
                ListOutput.add(a);
            }
        }

        String string = ListOutput.stream().map(String::valueOf).collect(Collectors.joining());
        return string;
    }


    @Override
    public String descriptografar(String texto) {
        if (texto.equals("")) {
            throw new IllegalArgumentException("O texto não pode estar em branco");
        }
        char[] ArrayAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ArrayToCode = texto.toLowerCase().toCharArray();

        ArrayList<Character> ListAlphabet = new ArrayList<>();
        ArrayList<Character> ListToCode = new ArrayList<>();
        ArrayList<Character> ListOutput = new ArrayList<>();

        for (Character a : ArrayAlphabet) {
            ListAlphabet.add(a);
        }

        for (Character a : ArrayToCode) {
            ListToCode.add(a);
        }

        for (Character a : ArrayToCode) {
            if (ListAlphabet.indexOf(a) != -1) {
                ListOutput.add(ListAlphabet.get(ListAlphabet.indexOf(a) - 3));
            } else {
                ListOutput.add(a);
            }
        }
        String string = ListOutput.stream().map(String::valueOf).collect(Collectors.joining());
        return string;
    }
}