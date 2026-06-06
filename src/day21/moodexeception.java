package test;

public class moodexeception {
	private String message;
	moodexeception(String message)
	{
		this.message = message;
	}
	public String analyseMood()
	{
		try {
		if(message.contains("Happy"))
		{
			return "Happy";
		}
		else
		{
			return "Sad";
		}
		}
		catch (NullPointerException e){
			return "Happy";
		}
	}
}
