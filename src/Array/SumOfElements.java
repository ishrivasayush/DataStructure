package Array;

public class SumOfElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int res=sumOfElements(arr);
        System.out.println(sumOfElement(arr,5));
        System.out.println(res);
    }
    static int sumOfElements(int arr[])
    {
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    static int sumOfElement(int arr[],int n)
    {
        int res=n*(n+1)/2;
        return res;
    }
}
