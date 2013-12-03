package Schrack;

//MyServiceClient
import java.rmi.*;
import java.rmi.Naming;
import java.io.*;
public class MyServiceClient {
	public static void main( String args[] ) throws Exception {
		if ( System.getSecurityManager() == null ) {
			System.setSecurityManager( new RMISecurityManager() ); 
		}
		//MyService service = ( MyService ) Naming.lookup( "rmi://my.host.edu/MyService" );
		//System.out.println ( service.pi(17) );
		}
}
