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
		Registry registry = LocateRegistry.getRegistry(1099);
		Calculator p = ( Calculator ) registry.lookup( "rmi://my.host.edu/PiServer" );
		
		System.out.println ( p.pi(17) );
		}
}
