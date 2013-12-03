package Schrack;

import java.rmi.RemoteException;

public class Start {
	public static void main (String args[]) throws RemoteException { 
		PiServer pi= new PiServer("PiServer");
		pi.register();
		
		}
}
