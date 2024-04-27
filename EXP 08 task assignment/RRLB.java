import java.util.ArrayList;
import java.util.List;

public class RRLB {
    private List<String> serverList;
    private int currentIndex;

    public RRLB(List<String> serverList) {
        this.serverList = serverList;
        this.currentIndex = 0;
    }

    public String getNextServer() {
        if (serverList.isEmpty()) {
            throw new IllegalStateException("No servers available");
        }
        String nextServer = serverList.get(currentIndex);
        currentIndex = (currentIndex + 1) % serverList.size();
        return nextServer;
    }

    public static void main(String[] args) {
        // Creating a list of servers
        List<String> serverList = new ArrayList<>();
        serverList.add("Server A");
        serverList.add("Server B");
        serverList.add("Server C");

        // Creating a Round-robin load balancer
        RRLB loadBalancer = new RRLB(serverList);

        // Simulating requests
        for (int i = 1; i <= 5; i++) {
            String nextServer = loadBalancer.getNextServer();
            System.out.println("Request " + i + " sent to " + nextServer);
        }
    }
}