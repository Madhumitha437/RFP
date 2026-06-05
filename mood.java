package test;

public class mood {
	private String message;
	mood(String message)
	{
		this.message = message;
	}
	public String analyseMood()
	{
		if(message.contains("Happy"))
		{
			return "Happy";
		}
		else
		{
			return "Sad";
		}
	}
}
