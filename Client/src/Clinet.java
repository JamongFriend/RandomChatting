import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Clinet {
    private static final int PORT = 8000;
    static Socket csocket;
    static BufferedReader in;
    static PrintWriter out;

    private static void showUsage() {
        System.out.println("USAGE: \"BR:message\"if you want to send your message to whole other clients");
        System.out.println("USAGE: \"TO:peerID:message\"if you want to send your message to the specific client");
        System.out.println("USAGE: \"Quit:\"if you want to stop");
    }

    public void runsocket() throws IOException {
        csocket = new Socket("localhost", PORT);

        in = new BufferedReader(new InputStreamReader(csocket.getInputStream()));

        out = new PrintWriter((csocket.getOutputStream()));
    }
}


