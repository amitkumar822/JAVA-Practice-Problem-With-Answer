package ZZ_StartingTimePr;

import java.net.*;
import java.io.*;
public class Server
{
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    public Server(int port)
    {
        try
        {
            server = new ServerSocket(port);
            System.out.println("ZZ_StartingTimePr.Server started");
            System.out.println("Waiting for a ZZ_StartingTimePr.client ...");
            socket = server.accept();
            System.out.println("Client accepted");
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));
            String line = "";
            while (!line.equals("Finished"))
            {
                try
                {
                    line = in.readUTF();
                    System.out.println(line);
                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Server server = new Server(6000);
    }
}