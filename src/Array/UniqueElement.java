package Array;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]={1,2,3,4,5};
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        uniqueElement(arr);
    }
    //Approach 1 brute Force
    static void uniqueElement(int arr[])
    {
        int unique=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]!=arr[j])
                {
                    unique=arr[i];
                }
            }
        }
        System.out.println(unique);
    }
    //Approach 2
    static int uniqueElement2(int arr[])
    {
        int x=0;
        for (int i = 0; i < arr.length ; i++) {
            x=x^arr[i];
        }
        return x;
    }
}
