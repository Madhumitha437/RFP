package test;

import static org.junit.Assert.*;
import org.junit.Test;

public class moodTest2 {
	@Test
	public void sadtest()
	{
		mood m= new mood("I am Sad right now");
		String result= m.analyseMood();
		assertEquals("Sad",result );
	}
	@Test
	public void happyTest()
	{
		mood m= new mood("I am Happy right now");
		String result= m.analyseMood();
		assertEquals("Happy",result);
	}
}

