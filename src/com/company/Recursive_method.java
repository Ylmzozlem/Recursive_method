package com.company;

import java.util.Scanner;

public class Recursive_method {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter your number: ");
        System.out.print("Input:");
        int num=scn.nextInt();
        int end=num;
        System.out.print("Output:");
      do{
          System.out.print(end +" ");
          end-=5;
      }while(end>0);

      for(int i=end;i<=num;i+=5){
          System.out.print(i+" ");
      }





    }
}
