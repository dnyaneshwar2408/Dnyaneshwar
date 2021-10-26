import java.util.Scanner;
class Data{
    static int n;

    static void factorial()
    {
        int i, f = 1;
        if (n<=0)
        {   System.out.println("Invalid number");
            System.out.println("\n=======================\n");}
        else if (n==1)
        {System.out.println("Factorial is "  +n);
        System.out.println("\n=======================\n");}

        else {
            for ( i = 1; i <= n; i++) {
                f =f * i;
            }
            System.out.println("Factorial is "  +f);
            System.out.println("\n=======================\n");
        }
    }



    static void testarmstrong()
    {
        int temp = n;
        int a = 0;
        while (temp != 0) {
            a = a + (int)Math.pow(temp % 10, 3);
            temp =temp / 10;
        }
        if (a== n)
            System.out.println("It is an Armstrong no\n=======================\n");
        else
            System.out.println("It is not Armstrong no\n=======================\n");
    }

    static void testpalindrome() {
        int r = 0;
        int temp = n;
        while (temp != 0)
        {
            r = (r * 10) + (temp % 10);
            temp =temp / 10;
        }
        if (r == n)
            System.out.println(" It is Palindrome\n=======================\n");
        else
            System.out.println("It is Not palindrome\n=======================\n");
    }

    static void testprime() {
        int p = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                p = 0;
                break;
            }
        }
        if (p == 0)
        {
            System.out.println("It is Not Prime");
            System.out.println("\n=======================\n");
        }
        else
        { System.out.println("It is Prime");
        System.out.println("\n=======================\n");
        }
    }

    static void testfibonacciSeries() {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+"  "+b);
        for(int i=2;i<=n-1;i++)
        {
            c=a+b;
            System.out.print("  "+c);
            a=b;
            b=c;
        }
        System.out.println("\n=======================\n");
    }

    public static void main(String args[]) {
        int ch=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        n = sc.nextInt();


        while (ch<=6) {
            System.out.print(" 1.Factorial\n 2.Armstrong\n 3.Palindrome\n 4.Prime\n 5.FibonacciSeries\n 6.Exit\n");
            System.out.println("\n=======================\n");
            System.out.print("Enter Choice:");
            ch = sc.nextInt();
            System.out.println("\n=======================\n");
            switch (ch) {
                case 1:
                    factorial();
                    break;
                case 2:
                    testarmstrong();
                    break;
                case 3:
                    testpalindrome();
                    break;
                case 4:
                    testprime();
                    break;
                case 5:
                    testfibonacciSeries();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}