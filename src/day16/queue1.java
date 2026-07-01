package day16;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList<>();
		q.add(1);
		q.add(3);
		q.add(5);
		Stack<Integer> s= new Stack<>();
		while(!q.isEmpty())
		{
			s.push(q.remove());
		}
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
		System.out.println("Queue:"+q);
	}

}
