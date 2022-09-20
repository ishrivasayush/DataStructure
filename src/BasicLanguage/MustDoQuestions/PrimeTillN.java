package BasicLanguage.MustDoQuestions;

import java.util.Scanner;

public class PrimeTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <n ; i++) {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n)
    {
        if (n<=1)
        {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
