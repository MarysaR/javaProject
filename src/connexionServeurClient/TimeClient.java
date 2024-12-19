package connexionServeurClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TimeClient {

    private String hostname;
    private int port;
    private Socket client;

    public TimeClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }

    public void connect() throws IOException {
        client = new Socket(hostname, port);
        System.out.println("=== Client connecté");

        BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

        writer.write("HELLO\n"); // le client envoie un message au serveur
        writer.flush();

        String reponse = reader.readLine(); // le client lit le message du serveur
        System.out.println("=== " + reponse);

        client.close();
    }

    public static void main(String[] args) throws IOException {
        TimeClient client = new TimeClient("127.0.0.1", 12345);
        client.connect();
    }
}
