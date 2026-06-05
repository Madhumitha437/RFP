package test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class userTest2 {
	@ParameterizedTest
	@ValueSource( strings= {
			"abc@gmail.com",
		    "xyz@yahoo.com",
		    "test@outlook.com"
	})
	public void testValidEmail(String email)
	{
		user u= new user();
		boolean result =u.validateemail(email);
		assertTrue(result);
	}

}
