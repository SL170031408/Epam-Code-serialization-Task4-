package dhi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefiningTest1 {
	
	
	private static final double DELTA = 1e-15;
    Defining1 pd=new Defining1();

	@Test
	public void testIs_is_method() {
		assertEquals(375.0,pd.It_is_method(2500.0,3.0,5.0),DELTA);
		
	}
	@Test
	public void testIt_is_method1() {
		assertEquals(57.52192960547518,pd.It_is_method1(750.0, 3.0, 2.5),DELTA);
	}

}





