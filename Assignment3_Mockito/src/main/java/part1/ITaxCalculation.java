package part1;

public interface ITaxCalculation {

	public double computeTax(int amount);
	public double weeklySalary(Employee income);
	public double fortnightlySalary(Employee income);
	public double computeKiwiSaver(Employee kiwiOption);
}