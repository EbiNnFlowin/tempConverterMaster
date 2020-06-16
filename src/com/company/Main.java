package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
//there are no changes, this works for me Kirk
    public static void main(String[] args) {
	// write your code here
        double celsius = 0.0;
        double fahrenheit = 0.0;
        double kelvin = 0.0;
        double div = 0.0;
        int choice = 0;
        Scanner userInput = new Scanner(System.in);
        do {
        System.out.println("Press 1 if you want to convert from Celsius to Fahrenheit ");
        System.out.println("Press 2 if you want to convert from Celsius to Kelvin");
        System.out.println("Press 3 if you want to convert from Fahrenheit to Celsius");
        System.out.println("Press 4 if you want to convert from Fahrenheit to Kelvin");
        System.out.println("Press 5 if you want to convert from Kelvin to Celsius");
        System.out.println("Press 6 if you want to convert from Kelvin to Fahrenheit");
        System.out.println("Press 0 to exit");
        choice = userInput.nextInt();
        switch (choice){
            case 1:
                System.out.println("Please enter the degrees in Celsius");
                celsius = userInput.nextDouble();
                div =(double)9/5;
                fahrenheit =((celsius * div )+ 32);
                System.out.println(celsius+ " celsius is "+ fahrenheit + " degrees fahrenheit");
                break;
            case 2:
                System.out.println("Please enter the degrees in Celsius");
                celsius = userInput.nextDouble();
                kelvin = celsius + 273.15;
                System.out.println(celsius+ " celsius is "+ kelvin + " degrees kelvin");
                break;
            case 3:
                System.out.println("Please enter the degrees in Fahrenheit");
                fahrenheit = userInput.nextDouble();
                div =(double)5/9;
                celsius = ((fahrenheit - 32) * div);
                System.out.println(fahrenheit+ " fahrenheit is "+ celsius + " degrees celsius");
                break;
            case 4:
                System.out.println("Please enter the degrees in Fahrenheit");
                fahrenheit = userInput.nextDouble();
                div =(double)5/9;
                kelvin = (((fahrenheit - 32) * div)+273.15);
                System.out.println(fahrenheit+ " fahrenheit is "+ kelvin + " degrees kelvin");
                break;
            case 5:
                System.out.println("Please enter the degrees in Kelvin");
                kelvin = userInput.nextDouble();
                celsius = kelvin - 273.15;
                System.out.println(kelvin+ " kelvin is "+ celsius + " degrees celsius");
                break;
            case 6:
                System.out.println("Please enter the degrees in Kelvin");
                kelvin = userInput.nextDouble();
                div =(double)9/5;
                fahrenheit = (((kelvin - 273.15)*div)+32);
                System.out.println(kelvin+ " kelvin is "+ fahrenheit + " degrees fahrenheit");
                break;

            case 0:
                break;
            default:
                System.out.println("ERROR! INVALID OUTPUT");

            }
        }
        while (choice != 0);
    }
}
