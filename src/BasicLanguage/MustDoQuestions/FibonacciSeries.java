package BasicLanguage.MustDoQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=0;
        int b=1;
        for (int i = 1; i <=n ; i++) {
            int c=a+b;
            System.out.println(a);       //Print only a because its start from zero
            a=b;
            b=c;
        }
        System.out.println(nFibonacci(11));
    }
    static int nFibonacci(int n)
    {
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <=n ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-1];
    }

}
