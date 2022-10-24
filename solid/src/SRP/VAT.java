package SRP;

public class VAT {
	private double percentageVAT;

	public double kalkulatuVat(float amount) {
		return amount*percentageVAT;
	}
}
