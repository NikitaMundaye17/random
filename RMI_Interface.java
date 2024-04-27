import java.rmi.*;

public interface RMI_Interface extends Remote {
    public int sum(int a,int b) throws RemoteException;
}

