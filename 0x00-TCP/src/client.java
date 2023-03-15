import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {
    private Socket socket = null; // socket for the client
    private DataInputStream input = null; // I stream
    private DataOutputStream output = null; // O stream
    Scanner scan;


    public client() {
    scan = new Scanner(System.in);
    }

    private void openSocket() {
        try {
            socket = new Socket(constants.IP, constants.PORT);
            System.out.println("Client Started");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void closeSocket() {
        try {
            socket.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
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
        if (socket!=null) {
            openStreams();
            System.out.println("Client Started");            
        }
    }

    private void stopconnection()
    {
        closeSocket();
        closeStreams();
        System.out.println("Client Closed");
    }





public static void main(String[] args) {
    client Client = new client();
    Client.startconnection(); 
    Client.connecting();
    Client.stopconnection(); 
}

}