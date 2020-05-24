public class Bank 
{
    public static void main ( double P, double r, double n, char ch)
    {
      System.out.println("Enter i for Term Deposit");
      System.out.println("Enter ii for Recurring Deposit");
      switch(ch)
      {
          case'1':
          double calc1= 1+r/100;
          double A= P* Math.pow(calc1,n);
          System.out.println("Maturity Amount is " + A);
        break;
         case'2':
        double calc2= P*n;
         double Amt= calc2+ P*(n*(n+1)/2)*r/100*1/2;
         System.out.println("Maturity Amount is " + Amt);
        break;
        default:
        System.out.println("invalid input");
    }
}
}