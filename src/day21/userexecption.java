package day21;

public class userexecption {
	static class userinvalid extends Exception{
		public userinvalid(String message)
		{
			super(message);
		}
	}
	public static void validatefname(String fname)
		throws userinvalid{
		if(!fname.matches("^[A-Z][a-z]{2,}"))
			throw new userinvalid("Invalid First name");
		}
	public static void validatelname(String lname) throws userinvalid{
		if(!lname.matches("^[A-Z][a-z]{2,}"))
			throw new userinvalid("Invalid Last name");
	}
	public static void validateemail(String email) throws userinvalid{
		if(!email.matches("^[a-zA-z0-9.-]+@[a-z]+\\.[a-z]+{2,}+"))
			throw new userinvalid("Invalid email");
	}
	public static void validatepassword(String password) throws userinvalid
	{
		if(!password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$"))
			throw new userinvalid("Invalid password");
	}
	public static void validatemobileno(String mobile) throws userinvalid
	{
		if(!mobile.matches("[1-9]{2} [0-9]{10}"))
			throw new userinvalid("Invalid phoneno");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validatefname("Madhu");
			validatelname("Mitha");
			validateemail("madhumitha@gmail.com");
			validatepassword("Mduih@437");
			validatemobileno("91 9360781239");
		}
		catch(userinvalid e)
		{
			System.out.println(e.getMessage());
		}
	}

}
