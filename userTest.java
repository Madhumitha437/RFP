package test;

import static org.junit.Assert.*;
import org.junit.Test;
public class userTest {
	user u=  new user();
	@Test
	public void testValidfname()
	{
		assertTrue(u.validatefirst("Madhu"));
	}
	@Test 
	public void testInvalidfname()
	{
		assertFalse(u.validatefirst("madhu"));
	}
	@Test
	public void testValidlname()
	{
		assertTrue(u.validatelast("Mitha"));
	}
	@Test
	public void testInvalidlname()
	{
		assertFalse(u.validatelast("mitha"));
	}
    @Test
    public void testValidEmail() {
        assertTrue(u.validateemail("madhu123@gmail.com"));
    }

    // Email Sad
    @Test
    public void testInvalidEmail() {
        assertFalse(u.validateemail("madhu@gmail"));
    }

    // Mobile Happy
    @Test
    public void testValidMobile() {
        assertTrue(u.validatemobile("91 9876543210"));
    }

    // Mobile Sad
    @Test
    public void testInvalidMobile() {
        assertFalse(u.validatemobile("9876543210"));
    }

    // Password Happy
    @Test
    public void testValidPassword() {
        assertTrue(u.validatepassword("Madhu@123"));
    }

    // Password Sad
    @Test
    public void testInvalidPassword() {
        assertFalse(u.validatepassword("madhu123"));
    }
}
