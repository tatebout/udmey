package entities;

public class CurrencyConverter {
	public static double IOF = 0.06;

	public static double calcular(double dolar, double dollars) {
		return (dolar*dollars)+(dolar * dollars * (1.0*IOF));
	}
}
