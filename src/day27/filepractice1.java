package day27;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class filepractice1  {
	public static void main(String args[]) throws IOException
	{
		FileWriter fw= new FileWriter("Student.txt");
		fw.write("Madhu ");
		fw.write("Developer");
		fw.close();
		System.out.println("Data writtern");
		
		FileReader fr= new FileReader("Student.txt");
		Scanner s= new Scanner(fr);
		while(s.hasNext())
		{
			String word = s.next();
			System.out.println(word);
		}
		FileWriter wr= new FileWriter("Student.txt",true);
		wr.append(" java");
		wr.close();
		FileReader countfr= new FileReader("Student.txt");
		int count =0;
		while(countfr.read ()!= -1)
		{
			count++;
		}
		fr.close();
		s.close();
		countfr.close();
		System.out.println("Count :"+count);
		// count words
		BufferedReader d= new BufferedReader(new FileReader("Student.txt"));
		int words=0;
		String lines;
		while((lines=d.readLine())!=null)
		{
			words+=lines.split("\\s+").length;
			
		}
		System.out.println("Count of words:"+words);
		d.close();
		// count vowels
		FileReader vowel= new FileReader("Student.txt");
		int ch;
		int vowelc=0;
		while((ch=vowel.read())!=-1)
		{
			char c =Character.toLowerCase((char)ch);
			if(c=='a'|| c=='i'|| c=='e'|| c=='o'||c=='u') {
				vowelc++;
			}
		}
		fr.close();
		System.out.println("Vowel count:"+vowelc);
		vowel.close();
	}
}
