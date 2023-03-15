import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    private ServerSocket serversocket = null ; // socket for the server
    private Socket socket = null ; // socket for the client
    private DataInputStream input = null;  // I stream
    private DataOutputStream output = null; // O stream
    Scanner scan;

    public server()
    {
    scan = new Scanner(System.in);
    }

    private void openInputStream()  // open Input stream 
    {
        
    }


