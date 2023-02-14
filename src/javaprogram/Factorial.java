package javaprogram;

import java.util.Scanner;
 class Factorial {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=s.nextInt();
      System.out.println("Factorial of a given number : ");
      int fact = 1;
      for(int i=1;i<=n;i++)
      {
        fact=fact*i;
      }
        System.out.println(fact);
      
      s.close();

    }
}  


