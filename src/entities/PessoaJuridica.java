package entities;

public class PessoaJuridica extends TaxPayer {

	private Integer numberOfEmploees;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double anualIncome, Integer numberOfEmploees) {
		super(name, anualIncome);
		this.numberOfEmploees = numberOfEmploees;
	}

	public Integer getNumberOfEmploees() {
		return numberOfEmploees;
	}

	public void setNumberOfEmploees(Integer numberOfEmploees) {
		this.numberOfEmploees = numberOfEmploees;
	}
	
	@Override
	public double incomeTax() {
		
		double tax = getAnualIncome();
		if (numberOfEmploees > 10) {
			return (double) tax * 0.14;
		} 
		if (numberOfEmploees <= 10) {
			return (double) tax * 0.16;
		}
		return tax;
	}

}
