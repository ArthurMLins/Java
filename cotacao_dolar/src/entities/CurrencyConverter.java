package entities;

public class CurrencyConverter {

	public static double dollarPrice = 3.10;
	public double quantity;
	public double taxIOF = 6;
	
	public double valorBruto() {
		
		return dollarPrice * quantity;
	}
	
	public double valorFinal() {
			
		return valorBruto() + valorBruto() * taxIOF/100;
	}
}
