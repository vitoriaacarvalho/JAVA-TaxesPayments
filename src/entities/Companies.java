package entities;

public class Companies extends TaxesPayment {
	private Integer numberOfEmployees;

	public Companies() {
		super();
	}
	public Companies(String name, Double income, Integer numberOfEmployees) {
		super(name, income);
		this.numberOfEmployees = numberOfEmployees;
	}
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		if (numberOfEmployees<=14) {
			return getIncome()*0.16;
		}
		else {
			return getIncome()*0.14;
		}
	}
	

	
	
}
