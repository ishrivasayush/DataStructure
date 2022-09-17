package Array;
import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;
public class PairSum {
    public static void main(String[] args) {
        int arr[]={5,4,2,3,1};
        int sum=6;
//        pairSum(arr,sum);
        twoSum(arr,sum);
    }
    //Approach 1
   // brute force ------O(n^2)
   static void pairSum(int arr[],int sum)
   {
       for (int i = 0; i <arr.length ; i++) {
           for (int j = i+1; j < arr.length ; j++) {
               if (arr[i]+arr[j]==sum)
               {
                   System.out.println(arr[i]+" "+arr[j]);
               }
           }
       }
   }
    // Approach 2
    // 2's Pointer ------O(nlogn)
    // No duplicates
    static void twoSum(int arr[],int sum)
    {
        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;
        int count=0;
        while (i<j)
        {
            if ((arr[i]+arr[j])>sum)
            {
                j--;
            }
            else if((arr[i]+arr[j])<sum)
            {
                i++;
            }
            else {
                System.out.println(arr[i]+" "+arr[j]);
                i++;
                j--;
            }
        }

    }
}
