package SRP;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	Deduction d= new Deduction();
	VAT v=new VAT();

	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = d.deductionKalkulatu(billAmount, deductionPercentage);
		// VAT kalkulatzen dugu
		VAT= (float) v.kalkulatuVat(billAmount);
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
}
