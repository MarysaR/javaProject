package connexionServeurClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {

    private int port = 12345;
    private ServerSocket server;

    private void init() throws IOException {
        server = new ServerSocket(port);
    }

    public TimeServer() throws IOException {
        init();
    }

    public TimeServer(int port) throws IOException {
        this.port = port;
        init();
    }

    private void waitConnection() throws IOException {
        System.out.printf("Serveur démarré %s\n", server.getLocalSocketAddress());
        while (true) {
            Socket sockClient = server.accept();
            System.out.println(">>> Connexion du client " + sockClient.getInetAddress()
                    + "[" + sockClient.getPort() + "]");
            InputStream in = sockClient.getInputStream();
            OutputStream out = sockClient.getOutputStream();
            handleConnection(in, out);
            sockClient.close();
        }
    }

    private void handleConnection(InputStream in, OutputStream out) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        String hello = reader.readLine(); // le serveur lit ce que le client lui envoie
        System.out.println(hello);
        if (hello.equals("HELLO")) {
            writer.write(new Date().toString() + "\n"); // le serveur envoie au client un message
            writer.flush();
        }
    }

    public static void main(String[] args) throws IOException {
        TimeServer server = new TimeServer();
        server.waitConnection();
    }
}
