package Array;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i< arr.length ; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int arr[])
    {
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<arr[i-1])                    //If the current element is smaller than the previous element than we just return false.
            {
                return false;
            }
        }
        return true;
    }
}
