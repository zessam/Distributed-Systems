// import java.io.IOException;
// import java.net.DatagramPacket;
// import java.net.DatagramSocket;
// import java.nio.channels.NonWritableChannelException;

// public class server{

//     public static void main(String[] args) throws IOException {
        
//         // Step 1 : Create a socket to listen at port 8000
//         DatagramSocket ds = new DatagramSocket(8000);
//         byte[] receive = new byte[65535];
//         DatagramPacket DpReceive = null;
//         while (true) {
//             // Step2 : Create DatagramPacket to receive the data.
//             DpReceive = new DatagramPacket(receive, receive.length);
//             // Step 3 : receive the data in byte buffer.
//             ds.receive(DpReceive);
            
//             System.out.println("Client: " + data(receive));

//             // Exit the if the client sent -exit
//             if (data(receive).toString().equals("-exit"))
//             {
//                 System.out.println("Client sent -exit.....EXITING");
//                 break;
//             }


//             // Clear the buffer after every message 
//             receive = new byte[65535];
            
//         }

//         public static StringBuilder data(byte[] a) {

//             if (a == null) {
//                 return null;
//                 }    
                
//             StringBuilder ret = new StringBuilder();
//             int i = 0;
//             while (a[i] != 0) {
//                 ret.append((char) a[i]);
//                 i++;                
//             }

//             return ret;


//         }






//     }

    
// }


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.channels.NonWritableChannelException;

public class server{

    public static void main(String[] args) throws IOException {
        
        // Step 1 : Create a socket to listen at port 8000
        DatagramSocket ds = new DatagramSocket(8000);
        byte[] receive = new byte[65535];
        DatagramPacket DpReceive = null;
        while (true) {
            // Step2 : Create DatagramPacket to receive the data.
            DpReceive = new DatagramPacket(receive, receive.length);
            // Step 3 : receive the data in byte buffer.
            ds.receive(DpReceive);
            
            System.out.println("Client: " + data(receive));

            // Exit the if the client sent -exit
            if (data(receive).toString().equals("-exit"))
            {
                System.out.println("Client sent -exit.....EXITING");
                break;
            }


            // Clear the buffer after every message 
            receive = new byte[65535];
            
        }

        StringBuilder data(byte[] a) {

            if (a == null) {
                return null;
                }    
                
            StringBuilder ret = new StringBuilder();
            int i = 0;
            while (a[i] != 0) {
                ret.append((char) a[i]);
                i++;                
            }

            return ret;


        }






    }

    private static Object data(byte[] receive) {
        return null;
    }

    
}