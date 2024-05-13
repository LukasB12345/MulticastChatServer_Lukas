import java.net.*;
public class MulticastChatServer {
    public static void main(String[] args) {
        throws Exception {
            //Default port number we are going to use
        int portnumber = 8080;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        //Create a MulticastSocket
        MulticastSocket serverMulticastSocket = new MulticastSocket(portnumber);
            System.out.println("MulticastSocket is created at port " + portnumber);

            //Determine the IP adress of a host, given the host name
            InetAdress group = InetAddress.getByName("225.4.5.6");

            //getByName - returns IP adress of given host
        serverMulticastSocket.joinGroup(group);
            System.out.println("joinGroup method is called...");
            boolean infinite = true;

            //Continually receives data and prints them

        }
    }
