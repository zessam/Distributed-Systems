import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    private ServerSocket serversocket = null; // socket for the server
    private Socket socket = null; // socket for the client
    private DataInputStream input = null; // I stream
    private DataOutputStream output = null; // O stream
    Scanner scan;

    public server() {
        scan = new Scanner(System.in);
    }

    private void openInputStream() // open Input stream
    {
        try {

            input = new DataInputStream(socket.getInputStream());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void openOutputStream() {
        try {
            output = new DataOutputStream(socket.getOutputStream());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void openStreams() {
        openInputStream();
        openOutputStream();
    }

    private void closeStreams() {
        try {
            input.close();
            output.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void openSocket() {
        try {
            serversocket = new ServerSocket(constants.PORT);
            System.out.println("Server Started");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void closeSocket() {
        try {
            serversocket.close();
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void write()
    {
        try {
            String msg = scan.nextLine();
            output.writeUTF(msg);
            output.flush();
        }   
        catch (IOException ex) {
                System.out.println(ex.getMessage());
        }
    }

    private String read()
    {
        String line="";
        try {
            line = input.readUTF();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return line;

    }


    private void waitingconnection()
    {
        try {
            System.out.println("Waiting for Connection");
            socket = serversocket.accept();
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void connecting()
    {
        String line="";
        while (!line.equals(constants.STOP)) {
            line = read();
            System.out.println("Client: " + line);
            write();
            
        }
    }



    private void startconnection()
    {
        openSocket();
        waitingconnection();
        openStreams();
    }

    private void stopconnection()
    {
        closeSocket();
        closeStreams();
        System.out.println("Server Closed");
    }


    public static void main (String[] args)
    {
        server Server = new server();
        Server.startconnection();
        Server.connecting();
        Server.stopconnection();  
    }

}
