package Schrack;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Start {
	public static void main (String args[]) throws Exception { 
		
		if (System.getSecurityManager() == null)
			System.setSecurityManager ( new RMISecurityManager()); 
		PiServer svr = new PiServer("Server1");
		try
		{
		  LocateRegistry.createRegistry( Registry.REGISTRY_PORT );
		}
		catch ( RemoteException e )  { /* ... */ }
		Naming.bind ("Service1", svr);
		System.out.println ("Service bound....");
		System.out.println(svr.calculate(10));
	}
}
