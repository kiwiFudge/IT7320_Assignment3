import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import org.mockito.Mockito;
import org.mockito.Mockito.*;

public class ComputeImplementationTest {

	ComputeImplementation implementationObj;
	ICompute interfaceObj;
	int x, y;
	
	@Before
	public void setUp() throws Exception {
		implementationObj = new ComputeImplementation();
		x = 10;
		y = 12;
		
		// initialise mock object
		interfaceObj = Mockito.mock(ICompute.class);
		Mockito.when(interfaceObj.multiply(x, y)).thenReturn(120);
		
		implementationObj.setObj(interfaceObj);
	}

	@After
	public void tearDown() throws Exception {
		implementationObj = null;
		interfaceObj = null;
	}

//	@Test
//	public void testSquareVal() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testMultiply() {
		assertEquals((x * y), implementationObj.multiply(x, y));
	}

}
