package com.HarryCompany;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      int x = (int)Math.round(Math.random()*1000);
//       String result = NumberFormat.getCurrencyInstance().format(1234556.45344);
//       String res = NumberFormat.getPercentInstance().format(13.23);
//        System.out.println(result);
//        System.out.println(res);

        final byte mountInYear = 12;
        final byte percent = 100;

        System.out.print("age: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("you are " + age);

        System.out.print("Name : ");
        String name = new Scanner(System.in).nextLine().trim();
        System.out.println("your name is " + name);

        System.out.print("Principal : ");
        int principal = new Scanner(System.in).nextInt();
        System.out.println("The amount you want is  : " + principal);

        System.out.print("Interest Rate : ");
        float annualInterest = new Scanner(System.in).nextFloat();
        float monthlyInterest = annualInterest / percent / mountInYear;
        System.out.println("The amount monthly rate you want is  : " + monthlyInterest);

        System.out.print("Period (year) : ");
        byte years = new Scanner(System.in).nextByte();
        int numberOfPayment = years * mountInYear;
        System.out.println("The amount you want is  : " + numberOfPayment);

      double mortgage = principal * (monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayment)
              /(Math.pow(1+monthlyInterest,numberOfPayment)-1));


        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("your mortgage is : " + mortgageFormat);




    }
}
