package org.example;

public class Calculator {

    public static  void welcomeMenu(){
        System.out.println("##################################################################################");
        System.out.println("### Welcome to the Console Calculator ######");
        System.out.println("Select one of the menu options below.");
        System.out.println("---  Addition + ---");
        System.out.println("---  Subtration - ---");
        System.out.println("---  Multiplication * ---");
        System.out.println("---   Division /---");
    }

    public static  double add(double n1, double n2){
        return n1+n2;
    }
    public static  double sub(double n1, double n2){
        return  n1-n2;
    }

    public static  double mul(double n1, double n2){
        return  n1*n2;
    }

    public static  double div(double n1, double n2){
        return n1/n2;
    }
}
