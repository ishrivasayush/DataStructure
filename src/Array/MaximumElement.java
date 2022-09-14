package Array;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
        int max=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("Max element is "+ max);
    }
}
