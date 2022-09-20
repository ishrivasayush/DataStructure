package BasicLanguage.MustDoQuestions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int i=2;
        boolean isPrime=true;
        while (i<=Math.sqrt(n))
        {
            if (n%i==0)
            {
                isPrime=false;
                break;         //Break the loop
            }
            i++;
        }
        if (isPrime)
        {
            System.out.println("Is prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
