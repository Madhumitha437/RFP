package javaprojectday2;
import java.util.*;
public class swtich1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		String  d=c.nextLine();
		char h=d.charAt(0);
		switch(h)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				if(Character.isLetter(h))
					System.out.println("Consonants");
				else
					System.out.println("Invalid input");
		}
	}

}
