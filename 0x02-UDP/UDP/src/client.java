// import java.io.IOException;
// import java.net.DatagramPacket;
// import java.net.DatagramSocket;
// import java.net.InetAddress;
// import java.util.Scanner;

// public class client {
//     public static void main(String args[]) throws IOException
//     {
//         Scanner sc = new Scanner(System.in);
//          // Step 1:Create the socket object for
//         // carrying the data.
//         DatagramSocket ds = new DatagramSocket();

//         InetAddress ip = InetAddress.getLocalHost();
//         byte buf[] = null;
        
//         // loop while user not enters "-exit"
//         while (true) {

            
//             // convert the String input into the byte array.
//             buf = ip.getBytes();

            
//             // Step 2 : Create the datagramPacket for sending
//             // the data.
            
//             DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 8000);
//             dp.send(DpSend);

//             // break the loop if user enters "-exit"
//             if (inp.equals("-exit"))
//                 break;

//         }


        
//     }
// }



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class client {
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);
         // Step 1:Create the socket object for
        // carrying the data.
        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;
        
        // loop while user not enters "-exit"
        while (true) {

            
            // convert the String input into the byte array.
            buf = ip.getBytes();

            
            // Step 2 : Create the datagramPacket for sending
            // the data.
            
            DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 8000);
            dp.send(DpSend);

            // break the loop if user enters "-exit"
            if (inp.equals("-exit"))
                break;

        }


        
    }
}