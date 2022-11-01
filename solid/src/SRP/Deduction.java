package SRP;

public class Deduction {

	public float deductionKalkulatu(float amount, int percentage) {
		
		if (amount>5000) {
			return (amount*percentage+5 /1000);
		}
		else return (amount *percentage) /1000;
	}
}
