package BasicLanguage;

import java.util.Scanner;
//----Single line comments.
/*---MultiLine */
public class ThreeK1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if (n%3==0)
        {
            System.out.println("3k");
        }
        else if(n%3==0)
        {
            System.out.println("3k+1");
        }
        else
        {
            System.out.println("3k+2");
        }
    }
}
