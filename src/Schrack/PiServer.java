package Schrack;

//MyServiceServer
import java.math.BigDecimal;
import java.rmi.*;
import java.rmi.server.*;

public class PiServer extends UnicastRemoteObject {
	
	private Calculator calculation;
	private String name;
	
	public PiServer (String name) throws RemoteException {		
		super(); 
		this.name=name;
		calculation = new CalculatorImpl();	
	}
	
	
	public BigDecimal calculate(int digits) {
		return calculation.pi(digits);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
}