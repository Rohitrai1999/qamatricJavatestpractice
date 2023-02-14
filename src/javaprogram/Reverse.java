package javaprogram;

import java.util.Scanner;
class Reverse {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int reverse=0;
        System.out.println("The reverse number is");
        while(n>0)
        {
          int remainder=n%10;
          reverse=reverse*10 + remainder;
          n=n/10;
        }
        System.out.println(reverse);
        s.close();
    }
}
