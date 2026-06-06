package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class moodexeceptionTest {

	@Test
	public void sadtest()
	{
		moodexeception m= new moodexeception("I am Sad right now");
		String result= m.analyseMood();
		assertEquals("Sad",result );
	}
	@Test
	public void happyTest()
	{
		moodexeception m= new moodexeception("I am Happy right now");
		String result= m.analyseMood();
		assertEquals("Happy",result);
	}
	@Test 
	public void nullTest()
	{
		moodexeception m= new moodexeception(null);
		String result= m.analyseMood();
		assertEquals("Happy",result);
	}
}
