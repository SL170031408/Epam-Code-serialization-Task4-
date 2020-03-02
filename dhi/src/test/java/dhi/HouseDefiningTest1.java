package dhi;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseDefiningTest1 {
    HouseDefining1 p1=new HouseDefining1();
    
	@Test
	public void testCost() {
		assertEquals(5000000.0,p1.it_is_cost(" standard material" , 2000, " automated fully home"),0);
		
	}

}
