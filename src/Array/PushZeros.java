package Array;

import static Array.Segregate.printArray;

public class PushZeros {
    public static void main(String[] args) {
        int arr[]={2,3,0,2,0};
        moveZeros(arr);
        printArray(arr);
    }
    static void moveZeros(int arr[])
    {
        int i=0;
        for (int j = 0; j < arr.length ; j++) {
            if (arr[j]>0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
}
