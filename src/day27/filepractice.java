package day27;
import java.io.File;
import java.io.IOException;
public class filepractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1= new File("Student.txt");
		try {
			if(f1.createNewFile())
				System.out.println("File Created");
			else
				System.out.println("File already there");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
