package entities;

public final class Individual extends TaxPayer {
	private Double healthExpenses;

	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double incomeTaxCalculation() {

		if (getAnnualIncome() < 20000.0) {
			return getAnnualIncome() * 0.15 - healthExpenses * 0.5;
		} else {
			return getAnnualIncome() * 0.25 - healthExpenses * 0.5;
		}
	}
}
