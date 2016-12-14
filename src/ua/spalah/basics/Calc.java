package ua.spalah.basics;

import java.util.Scanner;

/**
 * Created by dmitry.dev on 14.12.2016.
 */
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Calc");
        String UserLine ="";
        double result = 0;
        do
        {
            UserLine = scanner.nextLine();
            UserLine = UserLine.trim();
            String[] UserInput = UserLine.split(" ");
            char action;
            double fVal = 0;
            double sVal = 0;
            if(UserInput.length==2)
            {
                sVal = Double.parseDouble(UserInput[1]);
                action = UserInput[0].charAt(0);
                result = Calc(result,sVal,action);
                System.out.println(String.format("Result = %.3f",result));
            }
            else if(UserInput.length==3)
            {
                fVal = Double.parseDouble(UserInput[0]);
                sVal = Double.parseDouble(UserInput[2]);
                action = UserInput[1].charAt(0);
                result = Calc(fVal,sVal,action);
                System.out.println(String.format("Result = %.3f",result));
            }
            else
            {
                System.out.println("What are you want from me?");
            }
        }
        while(!UserLine.equals("exit"));
        System.out.println("Shutdown Calc");
    }
    public static double Calc(double a,double b,char action)
    {
        double result = 0;
        switch (action)
        {
            case '+':
            {
                result = a+b;
                break;
            }
            case '-':
            {
                result = a-b;
                break;
            }
            case '*':
            {
                result = a*b;
                break;
            }
            case '/':
            {
                result = a/b;
                break;
            }
            default:
            {
                System.out.println("What are you want from me?");
            }
        }
        return result;
    }
}