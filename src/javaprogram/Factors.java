package javaprogram;

import java.util.Scanner;
class Factors {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=s.nextInt();
      System.out.println("Factors of a given number : ");
      for(int i=1;i<=n;i++)
      {
        if(n%i==0)
        {
            System.out.println(i);
        }
      }
      s.close();
    }
}
