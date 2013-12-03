package Schrack;

import java.math.BigDecimal;
import java.rmi.RemoteException;

//Calculator.java
public interface Calculator extends java.rmi.Remote {
	public BigDecimal pi (int digits) throws RemoteException;
}
