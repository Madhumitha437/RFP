 package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareunit {

	@Test
	public void Squareof5() {
		unittest u= new unittest();
		int result=u.square(5);
		  System.out.println("Square of 5 = " + result);
		assertEquals(25,result);
	}
	@Test
	 public void testSquareOf0() {
	        unittest u = new unittest();
	        assertEquals(0, u.square(0));
	    }

	    @Test
	    public void testSquareOfNegativeNumber() {
	        unittest u = new unittest();
	        assertEquals(16, u.square(-4));
	    }

}
