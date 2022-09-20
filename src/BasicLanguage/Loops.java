package BasicLanguage;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //While loop
        int i=1;
        while (i<=n)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("Done");
    }
}
