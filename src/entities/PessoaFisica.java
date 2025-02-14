package entities;

import java.util.ArrayList;
import java.util.List;

public class PessoaFisica extends TaxPayer {
	
	private Double healthExpenditures;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double incomeTax() {
		
		double tax = getAnualIncome();
		if (tax < 20000.00) { 
			return tax * 0.15 - (healthExpenditures * 0.5);
		}
		
		if (tax >= 20000.00){
			return tax * 0.25 - (healthExpenditures * 0.5);
		}
		return tax;
	}
	
}
