package day13;

class maximumtest <T extends Comparable<T>>
{
	T a;
	T b;
	T c;
	maximumtest(T a, T b, T c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public T maximum()
	{
		if(a.compareTo(b)>0 && a.compareTo(c)>0)
			return a;
		else if(b.compareTo(c)>0)
			return b;
		else 
			return c;
	}
}
public class maximum
{
    public static void main(String[] args)
    {
      
     maximumtest<Integer> t= new maximumtest<>(23,2,90);
     System.out.println("Maximum:"+t.maximum());
     

      maximumtest<Float> f =new maximumtest<>(10.5f,7.8f,15.2f);
      System.out.println("Maximum:"+f.maximum());

     maximumtest<String> s= new maximumtest<>("Peach","banana","apple");
     System.out.println("Maximum:"+s.maximum());


    }
}