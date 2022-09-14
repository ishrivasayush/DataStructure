package Array;
/*
By default values are store when we don't initialize the array.
For boolean its a false value.
 */
public class Basic {
    public static void main(String[] args) {
        int arr[]=new int[5];
        boolean[] bo=new boolean[5];
        char ch[]=new char[20];
        //This is also working and create 97 size of array.
        int arr1[]=new int['a'];

        arr[0]=10;
        arr[2]=20;
        arr[3]=30;
        arr[4]=40;
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
