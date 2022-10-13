package org.example;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {


        Calculator.welcomeMenu();
        boolean exitApplio = true;



        while(exitApplio){
            char userChar;

            double n1=0,n2=0;
            boolean flag1, flag2;
            Scanner sc = new Scanner(System.in);
            System.out.println("##################################################################################");

            //handle user arithmetic character and exit program
            do {
                System.out.println("Choose one of the char character Calculator (+)(-)(*)(/) or exit  Calculator program (e):");
                userChar = sc.next().charAt(0);

                if(userChar == '+' ||  userChar =='-' || userChar == '*' || userChar =='/'){
                    flag1 = false;
                } else if (userChar == 'e' || userChar == 'E') {
                    flag1 = false;
                    exitApplio = false;
                } else {
                    flag1 = true;
                }

            }while(flag1);





           if(exitApplio == true){
               //handle first  number to only enter number
               do {
                   try{
                       Scanner Sc = new Scanner(System.in);
                       System.out.println("Enter the First Number");
                       n1 = Sc.nextDouble();
                       flag2 = false;
                   }catch (Exception e){
                       System.out.println("Enter only integer value..");
                       flag2 = true;
                   }
               }while(flag2);

               //handle second  number to only enter number
               do {

                   try{
                       Scanner Sc = new Scanner(System.in);

                       System.out.println("Enter Second Number");
                       n2 = Sc.nextDouble();
                       flag2 = false;
                   }catch(Exception e){
                       System.out.println("Enter only integer value..");
                       flag2 = true;
                   }
               }while (flag2);
           }


            //different case for the menu selection
            switch (userChar){
                case '+':
                    System.out.println("Answer: "+Calculator.add(n1,n2) );
                    break;
                case  '-':
                    System.out.println("Answer: "+Calculator.sub(n1,n2));
                    break;
                case '*':
                    System.out.println("Answer: "+Calculator.mul(n1,n2));
                    break;
                case '/':
                    System.out.println("Answer: "+Calculator.div(n1,n2));
                    break;

                default:
                    System.out.println("Bye thank you for your time");


            }
        }


    }
}
