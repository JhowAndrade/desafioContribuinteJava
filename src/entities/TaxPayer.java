package entities;

public class TaxPayer {
  
	private  double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationsSpending;

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationsSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationsSpending = educationsSpending;
	}
	
	public TaxPayer() {
		
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double serviceIncome) {
		this.servicesIncome = serviceIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationsSpending() {
		return educationsSpending;
	}

	public void setEducationsSpending(double educationsSpending) {
		this.educationsSpending = educationsSpending;
	}
	
	public double salaryTax() {
		if(salaryIncome < 36000) {
			return 0.00;
		}else if(  salaryIncome <= 60000) {
			return salaryIncome * 0.10;
		}else {
			return salaryIncome * 0.20;
		}	
	}	
		
	public double servicesTax() {
		if(servicesIncome > 0){
			return servicesIncome * 0.15;
		}else {
			return 0.0;
		}
	}
	
	public double capitalTax() {
		if(capitalIncome > 0){
			return capitalIncome * 0.20;
		}else {
			return 0.0;
		}
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
		}
	
	public double taxRebate() {
		double taxTotal =+ grossTax() * 0.30;
		
		if( healthSpending + educationsSpending <= taxTotal) {
			return healthSpending + educationsSpending;
		} else {
			return taxTotal;
		}
	}
	
	public double netTax() {
		return  grossTax() - taxRebate(); 
	}
		
}

