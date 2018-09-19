package part1;

public class TaxCalculationImplementation implements ITaxCalculation {

	ITaxCalculation obj;
	
	public double computeTax(int amount) {
		return obj.computeTax(amount);
	}

	public double weeklySalary(Employee income) {
		return obj.weeklySalary(income);
	}

	public double fortnightlySalary(Employee income) {
		return obj.fortnightlySalary(income);
	}

	public double computeKiwiSaver(Employee kiwiOption) {
		return obj.computeKiwiSaver(kiwiOption);
	}
	
	public void setObj(ITaxCalculation obj) {
		this.obj = obj;
	}

}
