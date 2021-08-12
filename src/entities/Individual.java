package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures = 0.00;

	public Individual() {
		super();
	}
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
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
	public double tax() {
		// se o ganho anual for inferior a 20000 imposto de 15%, senão imposto de 25%. Subtrai 50% dos gastos com saúde
		return (getAnualIncome() < 20000 ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25) - healthExpenditures*0.5;
	
	}

}
