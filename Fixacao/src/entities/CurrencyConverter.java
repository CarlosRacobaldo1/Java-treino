package entities;

// Static members
public class CurrencyConverter {
	public static final double IOF = 1.06;
	
	public static double conversor(double dolarPrice, double dolarAmount) {
		return dolarPrice * dolarAmount * IOF;
	}
}
