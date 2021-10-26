import java.util.Scanner;
class Account
{
    String cust_name;
   int  cust_accno;
    int cust_balance;
    int rate;
    void Account()
    {
        rate=3;


        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Name :");
        cust_name = sc.nextLine();
        System.out.print("Enter Account no :");
        cust_accno = sc.nextInt();
        System.out.print("Enter your balance :");
        cust_balance= sc.nextInt();
        System.out.print("------------------------\n");

    }
    void deposit(int cust_depo)
    {
        cust_balance=cust_balance + cust_depo;
        display();
    }
    void withdraw(int cust_withd)
    {
        if(cust_balance<cust_withd && cust_balance>0) {
            System.out.println("NO withdrawal..");

        }
        else if(cust_withd>=500)
            cust_balance = cust_balance - cust_withd;
        else
            System.out.println("Withdraw atleast 500..");



        display();
    }
    void interest()
    {
        cust_balance=cust_balance + (cust_balance*rate/1200);
        display();
    }
    void display()
    {
        System.out.print("------------------------\n");
        System.out.println("Balance is "+cust_balance  );
        System.out.print("------------------------\n");
    }
}

class Banking
{
    public static void main(String args[])
    {
        int ch=0;
        Account a=new Account();
        Scanner sc =  new Scanner(System.in);
        while(ch<=6)
        {
            System.out.println(" 1. Create Acc \n 2. Deposit\n 3. Withdraw\n " +
                    "4. Compute  Interest\n 5. Display balance\n 6. Exit");
            System.out.print("Enter choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    a.Account();
                    System.out.println("*your acoount is created*");
                    System.out.print("------------------------\n");
                }
                case 2 -> {
                    System.out.print("Enter amount for deposit:");
                    a.deposit(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Enter amount of withdrawal:");
                    a.withdraw(sc.nextInt());
                }
                case 4 -> a.interest();
                case 5 -> a.display();
                case 6 -> System.exit(1);
                default -> {
                    System.out.println("Wrong choice");
                    System.out.print("------------------------\n");
                }
            }
        }
    }
}