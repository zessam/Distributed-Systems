import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class Client {
    Scanner scan;
    Socket socket = null;
    DataInputStream input = null;
    DataOutputStream output = null;
    InetAddress ip;

    public Client() {

        try {
            ip = InetAddress.getByName("localhost");
            socket = new Socket(ip, constants.PORT);
            input = new DataInputStream(socket.getInputStream());
            output = new DataOutputStream(socket.getOutputStream());
            scan = new Scanner(System.in);
        }

        catch (UnknownHostException ex) {
            System.out.println("Client : " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Client :" + ex.getMessage());
        }
    }

    private void readMessageThread() {
        Thread readMessage = new Thread(new Runnable() {
        @Override  
        public void run() {
            while (true) {
                try {
                    String msg = input.readUTF();
                    System.out.println(msg);
                } catch (IOException ex) {
                    System.out.println("readMessagethread : " + ex.getMessage());
                }                
            }
        }
        
        });
        readMessage.start();
    }

    private void writeMessageThread() {
        Thread sendMessage = new Thread(new Runnable() {
            @Override  
            public void run() {
                while (true) {
                    String msg = scan.nextLine();

                    try {
                        output.writeUTF(msg);
                    } catch (IOException ex) {
                        System.out.println("readMessagethread : " + ex.getMessage());
                    }                
                }
            }
            
            });
            sendMessage.start();
    }



public static void main(String[] args) {
    Client client = new Client();
    client.readMessageThread();
    client.writeMessageThread();
}

}