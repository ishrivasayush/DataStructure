package Array;

import static Array.SumOfElements.sumOfElements;

public class AvgOfArrayElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=sumOfElements(arr);
        int avg=sum/ arr.length;
        System.out.println(avg);
    }
}
