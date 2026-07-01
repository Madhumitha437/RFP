package day5;
public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length == 0) {
	            System.out.println("Error: No command-line argument provided!");
	            return;  
	        }
		if(args.length>31)
		{
			System.out.println("Print not possible than 31");
			return;
		}
		int powern=Integer.parseInt(args[0]);
		System.out.println("Power of 2 table :");
		for(int i=0;i<=powern;i++)
		{
			System.out.println("2^"+i+":"+ (int)Math.pow(2,i));
		}
	}

}