import java.net.*;
import java.io.*;

public class ServerDemo extends Thread{
   private ServerSocket ServerSocket;
   public ServerDemo(int port) throws IOException {
      ServerSocket = new ServerSocket(port);
      ServerSocket.setSoTimeout(100000);
   }

   public void run(){
      while(true){
         try{
            System.out.println("Waiting for client on port " +
            ServerSocket.getLocalPort() + "...");
            Socket ServerDemo = ServerSocket.accept();
            System.out.println("Just connected to "
                  + ServerDemo.getRemoteSocketAddress());
            DataInputStream in =
                  new DataInputStream(ServerDemo.getInputStream());
            System.out.println(in.readUTF());
            DataOutputStream out =
                 new DataOutputStream(ServerDemo.getOutputStream());
            out.writeUTF("Thank you for connecting to "
              + ServerDemo.getLocalSocketAddress() + "\nGoodbye!");
            ServerDemo.close();
         }catch(SocketTimeoutException s)
         {
            System.out.println("Socket timed out!");
            break;
         }catch(IOException e)
         {
            e.printStackTrace();
            break;
         }
      }
   }
   public static void main(String [] args)
   {
     System.out.println("Press ctrl+c to terminate");
      int port = Integer.parseInt(args[0]);
      try
      {
         Thread t = new ServerDemo(port);
         t.start();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}
