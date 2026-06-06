package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class moodexeceptionuc3Test {

	@Test
	public void sadtest() throws Exception
	{
		moodexeceptionuc3 m= new moodexeceptionuc3 ("I am Sad right now");
		String result= m.analyseMood();
		assertEquals("Sad",result );
	}
	@Test
	public void happyTest() throws Exception
	{
		moodexeception m= new moodexeception("I am Happy right now");
		String result= m.analyseMood();
		assertEquals("Happy",result);
	}
	@Test 
	public void nullexe() {
		moodexeceptionuc3 m= new moodexeceptionuc3(null);
		try {
			m.analyseMood();
		     fail("Expected MoodAnalysisException");
        } catch (moodcustom e) {
            assertEquals("Mood should not be NULL", e.getMessage());
		}
	}
	@Test
	public void givenEmptyMood_ShouldThrowException() {

		moodexeceptionuc3 m = new moodexeceptionuc3("");

        try {
            m.analyseMood();
            fail("Expected MoodAnalysisException");
        } catch (moodcustom e) {
            assertEquals("Mood should not be EMPTY", e.getMessage());
        }

	}
	}

