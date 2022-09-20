package BasicLanguage.MustDoQuestions;
import java.util.Scanner;
public class NumberDigitPrintFromLast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        while (n!=0)
        {
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
        }
    }
}

