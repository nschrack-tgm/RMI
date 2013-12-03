package Schrack;

//MyServiceClient
import java.rmi.*;
import java.rmi.registry.Registry;
import java.io.*;
public class MyClient {
	public static void main( String args[] ) throws Exception {
		if ( System.getSecurityManager() == null ) {
			System.setSecurityManager( new RMISecurityManager() ); 
		}
		Calculator service = ( Calculator ) Naming.lookup( "rmi://my.host.edu/PiServer" );
		System.out.println ( service.pi(17) );
		}
}
