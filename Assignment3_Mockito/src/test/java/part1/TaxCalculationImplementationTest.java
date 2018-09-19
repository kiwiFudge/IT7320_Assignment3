package part1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class TaxCalculationImplementationTest {

	TaxCalculationImplementation implementationObj;
	ITaxCalculation interfaceObj;
	Employee emp;
	double tax, kiwisaver;
	int week, fortnight;
	
	@Before
	public void setUp() throws Exception {
		implementationObj = new TaxCalculationImplementation();
		emp = new Employee();
		emp.setSalary(100000);
		tax = 0.3;
		kiwisaver = .08;
		week = 52;
		fortnight = 26;
		
		interfaceObj = Mockito.mock(ITaxCalculation.class);
		Mockito.when(interfaceObj.computeTax(emp.getSalary())).thenReturn(30000.00);
		Mockito.when(interfaceObj.weeklySalary(emp)).thenReturn(1923.08);
		Mockito.when(interfaceObj.fortnightlySalary(emp)).thenReturn(3846.15);
		Mockito.when(interfaceObj.computeKiwiSaver(emp)).thenReturn(153.85);	
		
		implementationObj.setObj(interfaceObj);
	}

	@After
	public void tearDown() throws Exception {
		implementationObj = null;
		interfaceObj = null;
		emp = null;
	}

	@Test
	public void testComputeTax() {
		assertEquals(emp.getSalary() * tax, implementationObj.computeTax(emp.getSalary()), 2);
	}

	@Test
	public void testWeeklySalary() {
		assertEquals(emp.getSalary() / week, implementationObj.weeklySalary(emp), 2);
	}

	@Test
	public void testFortnightlySalary() {
		assertEquals(emp.getSalary() / fortnight, implementationObj.fortnightlySalary(emp), 2);
	}

	@Test
	public void testComputeKiwiSaver() {
		assertEquals(emp.getSalary() / week * kiwisaver, implementationObj.computeKiwiSaver(emp), 2);
	}

}
