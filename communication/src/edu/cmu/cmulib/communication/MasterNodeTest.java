import java.net.InetAddress;
import java.net.Socket;

//TODO (fyraimar) delete it
import java.net.*;
import java.io.*;

public class MasterNodeTest {
    public static  void main(String[] args) {
        System.out.println("I'm a MasterNode!");

        try {
            System.out.println(InetAddress.getLocalHost().getHostAddress());

            ServerSocket server = new ServerSocket(8000);
            BufferedReader is = null;
            Socket socket = null;

            int i = 9999999;
            while (i > 0) {
                socket = server.accept();

                String line;
                is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("Slave: " + is.readLine());
            }

            is.close();
            socket.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }


    }
}
