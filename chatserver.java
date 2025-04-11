import java.io.*;
import java.net.*;

public class chatserver {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(1234);
        System.out.println("server is running ");

        Socket c = s.accept();
        System.out.println("Coneection established");

        BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
        PrintWriter out = new PrintWriter(c.getOutputStream(), true); 
        BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
        String clientMsg, serverMsg;
        while (true) {
            clientMsg = in.readLine(); 
            if (clientMsg == null || clientMsg.equalsIgnoreCase("exit")) {
                System.out.println("connection closed");
                break;
            }
            System.out.println("Client: " + clientMsg);
            System.out.print("Server: ");
            serverMsg = i.readLine();
            out.println(serverMsg);   
        }

    }
}
