package SRP;

public class VAT {
	private double percentageVAT;
	
	public VAT() {
		percentageVAT=0.16;
	}

	public double kalkulatuVat(float amount) {
		return amount*percentageVAT;
	}
}
