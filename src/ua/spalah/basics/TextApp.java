package ua.spalah.basics;

import java.util.Scanner;

/**
 * Created by dmitry.dev on 14.12.2016.
 */
public class TextApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sex ="";
        String name="";
        int age=0;
        System.out.println("What is your name?");
        name=scanner.nextLine();
        System.out.println("Sex? (m/w)");
        sex = scanner.nextLine().trim();
        if(!sex.equals("m") && !sex.equals("w")) {
            while (!sex.equals("m") && !sex.equals("w")) {
                System.out.println("Are you sure? (m/w)");
                sex = scanner.nextLine().trim();
            }
        }
        System.out.println("How old are you? (int)");
        try {
            age = Integer.parseInt(scanner.nextLine().trim());
        }
        catch (Exception e)
        {
            System.out.println("Are you sure?");
        }
        if(age<1) {
            while (age<1) {
                try {
                    age = Integer.parseInt(scanner.nextLine().trim());
                }
                catch (Exception e)
                {
                    System.out.println("Are you sure?");
                }
            }
        }
        System.out.println(sex.equals("m")?"Man!":"Woman!");
        System.out.println("Your name is "+name);
        System.out.println("You are "+age+" years old.");
        System.out.println("That all what i know about you..");
    }
}
