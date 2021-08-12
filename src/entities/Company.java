package entities;

public class Company extends TaxPayer{

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
	public double tax() {

		return (numberEmployees > 10 ? getAnualIncome()*0.14 : getAnualIncome()*0.16);
		
	}
	
}
