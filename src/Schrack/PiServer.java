package Schrack;

//MyServiceServer
import java.math.BigDecimal;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteServer;
import java.rmi.server.UnicastRemoteObject;

public class PiServer{
	
	private Calculator calculation;
	private String name;
	private CalculatorImpl svr;
	private Registry registry;
	
	public PiServer (String name) throws RemoteException {		
		super(); 
		this.name=name;
		calculation = new CalculatorImpl();	
	}
	
	public void register()throws RemoteException{
		if (System.getSecurityManager() == null)
			System.setSecurityManager ( new RMISecurityManager()); 

		//RMI-Registry wird gestratet 
		registry = LocateRegistry.createRegistry( Registry.REGISTRY_PORT );


		svr = new CalculatorImpl();
		Calculator stub = (Calculator) UnicastRemoteObject.exportObject( svr, 0 );

   	 	registry.rebind( name, stub );	
   	 	System.out.println("Successfull");
	}
	
	public void unregister()throws RemoteException, NotBoundException{
		UnicastRemoteObject.unexportObject( svr, true );
		registry.unbind(name);

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
}