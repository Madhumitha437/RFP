package day14;
import java.util.LinkedList;
import java.util.Queue;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uc1
	LinkedList<Integer> l = new LinkedList<>();
	l.push(56);
	l.push(30);
	l.push(70);
	System.out.println("l1:"+l);
	//uc2
	LinkedList<Integer> l2 = new LinkedList<>(l);
	while(!l2.isEmpty())
	{
		System.out.println(l2.peek());
		l2.pop();
		System.out.println("After poping:"+l2);
	}
	//uc3
	Queue<Integer> q= new LinkedList<>();
	q.add(56);
	q.add(30);
	q.add(70);
	System.out.println("Queue:"+q);
	while(!q.isEmpty())
	{
	 int removedElement = q.poll();

     System.out.println("Dequeued Element: " + removedElement);

     System.out.println("Queue After Dequeue:");
     System.out.println(q);
	}
	}

}
