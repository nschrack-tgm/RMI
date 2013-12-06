package Schrack;

import java.rmi.RemoteException;

public class Start {
	public static void main (String args[]) throws RemoteException { 
		
		String [] login =new String [1];
		
		//Einlesen der Werte
		for(int i=0; i<args.length; i++){
		
				if(args[i].equals("-n"))
				{
					login[0]=args[i+1];
					i++;
				}else if(args[i].equals("help")){
					System.err.println("Usage: [-n NameOfServer ]");
					System.exit(1);

				}else{
					System.err.println("Usage: [-n NameOfServer ]");
					System.exit(1);
				
				}	
		}
		
		PiServer pi= new PiServer(login[0]);
		pi.register();

	}
}
