import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Classe Java (client) para Comunicação com servidor NodeJS
 * Escreve e recebe um simples "echo" -> "mensagem123"
 * by Douglas.Pasqua
 * http://douglaspasqua.com
 */
public class NodeJsEcho {
    // objeto socket
    private Socket socket = null;

    public static void main(String[] args) throws UnknownHostException,
            IOException, ClassNotFoundException {
        // instancia classe
        NodeJsEcho client = new NodeJsEcho();

        // conexão socket tcp
        String ip = "127.0.0.1";
        int port = 6969;
        client.socketConnect(ip, port);

        // escreve e recebe mensagem
        String message = "Olá Node!!!!";

        System.out.println("Enviando: " + message);
        String retorno = client.echo(message);
        System.out.println("Recebendo: " + retorno);
    }

    // realiza a conexão com o socket
    private void socketConnect(String ip, int port) throws UnknownHostException, IOException {
        System.out.println("[Conectando socket...]");
        this.socket = new Socket(ip, port);
    }

    // escreve e recebe mensagem full no socket (String)
    public String echo(String message) {
        try {
            // out & in
            PrintWriter out = new PrintWriter(getSocket().getOutputStream(), true);
            BufferedReader in = new BufferedReader
                    (new InputStreamReader(getSocket().getInputStream()));

            // escreve str no socket e lêr
            out.println(message);
            String chegada = in.readLine();
            String [] textArray = chegada.split("!");
//            System.out.println(textArray[0]);
            String retorno = textArray[0];
            return retorno;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // obtem instância do socket
    private Socket getSocket() {
        return socket;
    }
}