package Schrack;

//MyServiceClient
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.io.*;
public class MyClient {
	public static void main( String args[] ) throws Exception {
		if ( System.getSecurityManager() == null ) {
			System.setSecurityManager( new RMISecurityManager() ); 
		}
		Registry registry = LocateRegistry.createRegistry( Registry.REGISTRY_PORT );
		Calculator p= ( Calculator ) Naming.lookup( "rmi://my.host.edu/PiServer" );
		
		System.out.println ( p.pi(17) );
		}
}
