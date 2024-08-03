import java.util.Scanner;
class ATM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int start,ch,end=0 ;
        System.out.println("Enter the Starting Balance :");
        start = sc.nextInt();
        int bal = start;
        do
        {
        System.out.println("----------------------------------------------");
        System.out.println("Enter the Operation you want to perform :");
        System.out.println();
        System.out.println("(1) Withdraw Amount");
        System.out.println("(2) Deposit Amount");
        System.out.println("(3) Check Balance");
        System.out.println("(4) Exit");
        System.out.println();
        System.out.print("Enter your choice : ");
        ch = sc.nextInt();
        System.out.println("-----------------------------------------------");
        switch(ch)
        {
            case 1:
            {
                int w_amt;
                System.out.print("Enter the amount to be withdrawn: ");
                w_amt = sc.nextInt();
                if(w_amt>start)
                {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Insufficient Balance!");
                }
                else{
                bal = bal - w_amt;
                System.out.println("-----------------------------------------------");
                System.out.println("Withdrawn : "+w_amt);
            }
            }
            break;
            case 2 :
            {
                int d_amt;
                System.out.print("Enter the amount to be deposited : ");
                d_amt = sc.nextInt();
                bal = bal + d_amt;
                System.out.println("-----------------------------------------------");
                System.out.println("Deposited :"+d_amt);
            }
            break;
            case 3 :
            {
                System.out.println("Balance : "+bal);
            }
            break;
            case 4 :
            {
                end = 1;
            }break;
            default:System.out.println("Invalid choice");
        }
        }
        while(end == 0);
        sc.close();
    }
}
