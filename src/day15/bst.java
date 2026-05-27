package day15;
import java.util.TreeSet;
public class bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> bst= new TreeSet<>();
		//uc1
		bst.add(56);
		bst.add(30);
		bst.add(70);
		System.out.println("BST:"+bst);
		TreeSet<Integer> bst1=bst;
		bst1.add(22);
		bst1.add(40);
		bst1.add(11);
		bst1.add(3);
		bst1.add(16);
		bst1.add(60);
		bst1.add(95);
		bst1.add(65);
		bst1.add(63);
		bst1.add(67);
		System.out.println("BST1:"+bst1);
		System.out.println("Size of BST1:"+bst1.size());
	}

}
