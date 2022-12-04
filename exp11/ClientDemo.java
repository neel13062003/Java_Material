import java.net.*;
import java.io.*;

public class ClientDemo
{
   public static void main(String [] args) {
      String serverName = args[0];
      int port = Integer.parseInt(args[1]);
      try{
         System.out.println("Connecting to " + serverName + " on port " + port);
         Socket ClientDemo = new Socket(serverName, port);
         System.out.println("Just connected to " + ClientDemo.getRemoteSocketAddress());
         OutputStream outToServer = ClientDemo.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         out.writeUTF("Hello from " + ClientDemo.getLocalSocketAddress());
         InputStream inFromServer = ClientDemo.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         System.out.println("Server says " + in.readUTF());
         ClientDemo.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}
