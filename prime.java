package primeCheck;

import java.util.Scanner;




public class prime {

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any number :");
    int number = scan.nextInt();
    
    if(checkPrime(number))
        System.out.println("Number :"+number+" \n is prime");
       else
       System.out.println("Number :"+number+" \n is not prime");
  }
  public static boolean checkPrime(int number)
  {
    int count=0;
    boolean primee=false;
    
    for(int i=1; i<=number ;i++)
    {
      if(number%i==0)
      {
        count++;
      }
      
    }
    if(coun1t==2)
    {
      primee=true;
    }
    else
    {
      primee= false;
    }
    return primee;
  }
}
