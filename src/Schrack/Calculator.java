package Schrack;

import java.math.BigDecimal;

//Calculator.java
public interface Calculator extends java.rmi.Remote {
	public BigDecimal pi (int anzahl_nachkommastellen);
}
