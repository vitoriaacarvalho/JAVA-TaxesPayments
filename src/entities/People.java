package entities;

public class People extends TaxesPayment{
	private Double healthExpenses;
	
	public People() {
		super();
	}
	
	public People(String name, Double income, Double healthExpenses) {
		super(name, income);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public double tax() {
		double amountToBePaid;
		if (getIncome()<20000) {
			amountToBePaid=getIncome()*0.15;
		}
		else {
			amountToBePaid=getIncome()*0.25;
		}
		
		amountToBePaid-=healthExpenses*0.5;
		
		if (amountToBePaid<0) {
			amountToBePaid=0;
		}
		
		return amountToBePaid;
	}

	
	

}
