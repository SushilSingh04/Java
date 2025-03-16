package basics;

import java.util.Scanner;

public class secondsConversion{
    public static void main(String args[]){
        System.out.println("Enter number of seconds: ");
        Scanner scanner = new Scanner(System.in);
        int seconds = Integer.valueOf(scanner.nextLine());
        scanner.close();
        int days = seconds/(3600*24);
        int secondsLeft = seconds%(3600*24);
        int hours = secondsLeft/3600;
        secondsLeft = secondsLeft%3600;
        int minutes = secondsLeft/60;
        secondsLeft = secondsLeft%60;
        System.out.print(days+" day(s) ");
        System.out.print(hours + " hour(s) ");
        System.out.print(minutes + " minute(s) ");
        System.out.print(secondsLeft + " second(s) ");

    }
}