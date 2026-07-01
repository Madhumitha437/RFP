package day16;
import  java.util.Stack;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "{[()]}";
		Stack<Character> st= new Stack<>();
		for(char c :s.toCharArray() )
		{
			if(c=='(' || c=='{'|| c=='[')
			{
				st.push(c);
			}
			else
			{
				
				if(st.isEmpty())
					return;
				char top=st.pop();
				{
					if(c==')' && top=='('|| c==']'&& c=='['|| c=='}'&& c=='{' )
					{
						System.out.println("False");
						return;
					}
				}
			}
			
		}
	       System.out.println(st.isEmpty());
	}

}
