package Array;

public class Segregate {
    public static void main(String[] args) {
        int arr[]={-2,3,4,5,-6};
        segregate(arr);
        printArray(arr);
    }
    static void segregate(int arr[])
    {
       int i=0;
       for (int j = 0; j < arr.length ; j++) {
           if (arr[j]<0)
           {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
           }
        }
    }
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
