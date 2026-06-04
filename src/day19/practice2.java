package day19;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;
public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count digit in string 
		String str="Madh4u55";
		Pattern p= Pattern.compile("\\d");
		Matcher m=p.matcher(str);
		int count=0;
		while(m.find())
		{
			count++;
		}
		System.out.println(count);
		// also to extract the digit
		count=0;
		while(m.find())
		{
			System.out.println("Found:"+m.group());
			count++;
		}
		System.out.println(count);
		//count vowels
		Pattern p1= Pattern.compile("[aeiou]");
		Matcher m1=p1.matcher(str);
		int count1=0;
		while(m1.find())
		{
			System.out.println("Found:"+m1.group());
			count1++;
		}
		System.out.println("Vowel count :"+count1);
		//find all word starting with capital letter
		Pattern p2= Pattern.compile("\\b[A-Z][a-zA-Z]*\\b");
		String s2="Java is Developed By James Gosling MADHU 96";
		Matcher m2=p2.matcher(s2);
		while(m2.find())
		{
			System.out.println(m2.group());
		}
		// find string that are completely uppercase
		Pattern p3= Pattern.compile("\\b[A-Z]+\\b");
		Matcher m3=p3.matcher(s2);
		while(m3.find())
		{
			System.out.println(m3.group());
		}
		//remove all digits
		String result=s2.replaceAll("[0-9]", "");
		System.out.println(result);
		String str1= "Java new java java";
		HashMap<String ,Integer> hm= new HashMap<>();
		Pattern p4= Pattern.compile("\\b[a-zA-z]+");
		Matcher m4= p4.matcher(str1);
		while(m4.find())
		{
			String word=m4.group().toLowerCase();
			hm.put(word, hm.getOrDefault(word,0)+1);
		}
		System.out.println("Duplicate words:");
		for(Map.Entry<String, Integer> e:hm.entrySet())
		{
			if(e.getValue()>1)
				System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
