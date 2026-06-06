package test;
// error type
enum mooderror{
	NULL_MESSAGE,EMPTY_MESSAGE
}
//CUSTOM EXCEPTION
class moodcustom extends Exception
{
	mooderror type;
	public moodcustom(mooderror type, String message)
	{
		super(message);
		this.type=type;
	}
}
public class moodexeceptionuc3 {
	private String message;
	moodexeceptionuc3(String message)
	{
		this.message = message;
	}
	public String analyseMood() throws moodcustom
	{
		if(message==null)
		{
			throw new moodcustom(mooderror.NULL_MESSAGE,"Mood should not be NULL");
		}
		if (message.isEmpty())
		{
			throw new moodcustom(mooderror.EMPTY_MESSAGE,"Mood should not be EMPTY");
		}
		if(message.contains("Happy"))
		{
			return "Happy";
		}

			return "Sad";
	}

}
