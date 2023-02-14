package javaprogram;


import java.util.Scanner;
class SumFirstLastDigit {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s.nextInt();
        int temp=n;
        int reverse=0;                                         //not completed
        while(n!=0){
        int remainder=n%10;
         reverse=reverse*10 + remainder;
         n=n/10;

         
        }

        int k =temp%10;
        reverse=reverse%10;
        int sum=k+reverse;
        System.out.println("The last digit of number is "+k);
        System.out.println("The first digit of number is "+reverse);
        System.out.println("The sum is "+sum);
        s.close();

         
        
    }
}
