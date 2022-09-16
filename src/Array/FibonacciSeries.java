package Array;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        fibonacci(n);
//        nFibonacci(n);

    }
    static void fibonacci(int n)
    {
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");
        for (int i = 2; i <arr.length ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
    }
    static void nFibonacci(int n)
    {
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for ( int i =2; i <=n ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
}
