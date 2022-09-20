package BasicLanguage;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        //SinglePrintLine we use here
        System.out.println("*\n" +
                "* *\n" +
                "* * *\n" +
                "* * * *\n" +
                "* * * * *\n");

        System.out.println("* * * * *");
        System.out.println("      *");
        System.out.println("    *");
        System.out.println("  *");
        System.out.println("* * * * *");


        System.out.println("* * * * *\n       *\n     *\n   *\n *" +
                "\n* * * * *");


        //Exponent of the number
        System.out.println(Math.pow(2,3));

        //Here Its return int value because of TypeCasting
        int exp=(int)Math.pow(2,3);
        System.out.println(exp);


        //swapIng withOut Using Third Variable
        int a=10;
        int b=20;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);

    }
}
