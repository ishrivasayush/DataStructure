package Array;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt(); //Size of the array
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            //Taking userInput one by one and handle indexes just by using the for loop
            arr[i]= scanner.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
