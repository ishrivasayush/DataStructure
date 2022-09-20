package BasicLanguage.MustDoQuestions;

import java.util.Scanner;

public class NumberDigitPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int y=0;
        while (n!=0)
        {
            int rem=n%10;
            y=y*10+rem;
            n=n/10;
        }
        System.out.println(y);
    }
}
