package BasicLanguage.MustDoQuestions;

import java.util.Scanner;

public class NumberRotateByK {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int k= scanner.nextInt();
        int nod=0;
        int temp=number;
        while (temp!=0)
        {
            temp=temp/10;
            nod++;
        }
        k=k%nod;        //big number rotation
        if (k<0)
        {
            k=k+nod;    //For Minus Rotation
        }
        int div=1;
        int mul=1;
        for (int i = 1; i <=nod ; i++) {
            if(i<=k)
            {
                div=div*10;
            }
            else {
                mul=mul*10;
            }
        }
        int q=number/div;
        int r=number%div;
        int rotate=(r*mul)+q;
        System.out.println(rotate);
    }
}
