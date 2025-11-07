import java.util.*;
class bankingsystem 
{
public static void main(String[] args)
{
  int n,a=0;
  Scanner sc = new Scanner(System.in);
  while (true)
  {
  System.out.println("1. Withdraw ");
  System.out.println("2. Deposit");
  System.out.println("3. Check balance");
  System.out.println("Enter ur choice");
  n=sc.nextInt();
  switch(n)
  {
  case 1:
      System.out.println("Enter your amount to be withdrawn");
      int b=sc.nextInt();
      if(a<=0)
  {
    System.out.println("Insufficient balance");
  }
   else if(a>0&&b<=a)
  {
    a=a-b;
    System.out.println("Remaining balance: "+a);
  }
  else
  {
    System.out.println("Insufficient balance"+a);
  }
  break;
  case 2:
  System.out.println("Enetr your amount to be deposited");
  int s=sc.nextInt();
   a+=s;
   System.out.println("Total amount ="+a);
   break;
   case 3:
   System.out.println("Balance is= "+a);
   break;
}
    
}
}
}