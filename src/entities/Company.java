package entities;

public class Company extends TaxPayer {
	private int numberEmployees;

	public Company(String name, Double annualIncome, int numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double incomeTaxCalculation() {
		
		if (numberEmployees > 10) {
			return getAnnualIncome() * 0.14;
		} else {
			return getAnnualIncome() * 0.16;
		}

	}
}
