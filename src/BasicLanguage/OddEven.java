package BasicLanguage;


import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i=1;
        while (i<n)
        {
            if (evenOdd(i))
            {
                System.out.println("Even: "+i);
            }
            else {
                System.out.println("Odd: "+i);
            }
            i++;
        }

    }
    static boolean evenOdd(int n)
    {
        if (n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
