package day16;
import java.util.Stack;
public class stackrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character>  st= new Stack<>();
		String s= "java";
		for(char c:s.toCharArray())
		{
			st.push(c);
		}
		String rev="";
		while(!st.isEmpty())
		{
			rev+=st.pop();
		}
		System.out.println("Reverse:"+rev);
	}

}
