package day5;
import java.util.*;
public class TripletsZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println("Triplets are:");

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {

                    if(arr[i] + arr[j] + arr[k] == 0) {

                        count++;

                        System.out.println(
                            arr[i] + " " +
                            arr[j] + " " +
                            arr[k]
                        );
                    }
                }
            }
        }

        System.out.println("Total Triplets = " + count);
        sc.close();
    }
}