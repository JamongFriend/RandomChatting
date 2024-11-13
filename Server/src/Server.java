import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    int PORT = 8000;
    ServerSocket serverSocket = null;
    Socket socket = null;

    public void run() {
        try {
            serverSocket = new ServerSocket(PORT);
            while(true){

            }

        }
        catch(Exception exception) {
            exception.printStackTrace(System.out);
        }
    }
}
