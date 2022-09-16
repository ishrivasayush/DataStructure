package Array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]={1,2,3,4,5};
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println(search(arr,5));
    }

    static int search(int arr[],int key)
    {
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key)
            {
                index= i;
                break;
            }
        }
        return index;
    }
}

