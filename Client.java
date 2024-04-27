import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        // get the remote object from the registry
        try {
            // Get the remote object reference from the RMI registry
            Registry registry = LocateRegistry.getRegistry(1099); // Change to the IP address or hostname of the server or port number
            RMI_Interface obj = (RMI_Interface) registry.lookup("HelloServer");
            // Call the remote method
            int message = obj.sum(30, 20);
            System.out.println("Message from server: " + message);
        } catch (Exception e) {
            System.out.println("Client Exception: " + e.toString());
        } 
    }
} 