package entities;

public class Company extends Payer{

	private int numberEmployees;

	public Company() {
		super();
	}
	public Company(String name, Double anualIncome, int numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}
	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double totalTaxes() {

		if(numberEmployees > 10) {
			return this.getAnualIncome()*0.14;
		}else {
			return this.getAnualIncome()*0.16;
		}
	}
	
}
