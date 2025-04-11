import java.io.*;
import java.net.*;
public class chatclient{
	public static void main (String[] args)throws Exception{
		Socket socket= new Socket("localhost",1234);
		System.out.println("connected to the server");
		
		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String message;
		while (true) {
            System.out.print("You: ");
            message = userInput.readLine(); 
            out.println(message);

            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Connection closed.");
                break;
            }
			System.out.println("server: ");
            String serverMessage = in.readLine(); 
            System.out.println(serverMessage);
        }
	}
}