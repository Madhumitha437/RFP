package day16;

import java.util.Scanner;

public class RotationPoint {

    // Method to find rotation point
    public static int findRotationPoint(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            int mid = (left + right) / 2;

            // Smallest element in right half
            if(arr[mid] > arr[right])
            {
                left = mid + 1;
            }

            // Smallest element in left half
            else
            {
                right = mid;
            }
        }

        // left == right
        return left;
    }

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = c.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = c.nextInt();
        }

        int index = findRotationPoint(arr);

        System.out.println(
                "Rotation Point Index: "
                + index);

        System.out.println(
                "Smallest Element: "
                + arr[index]);
        c.close();
    }
}