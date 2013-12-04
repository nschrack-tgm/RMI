package Schrack;

//MyServiceClient
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
	public static void main( String args[] ) throws Exception {
		if ( System.getSecurityManager() == null ) {
			System.setSecurityManager( new RMISecurityManager() ); 
		}
		Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
		Calculator p = ( Calculator ) registry.lookup( "PiServer" );
		
		System.out.println ( p.pi(17) );
		}
}
