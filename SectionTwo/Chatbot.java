import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHello. What is your name?");
        String name = scanner.nextLine();           

        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String home = scanner.nextLine();
                        
        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        int age = scanner.nextInt();

        System.out.println("\nSo you're " + age +  ", cool! I'm 400 years old.");
        System.out.println("\nThis means I'm " + ((double)400 / age) + " times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (just don't say Python)");
        scanner.nextLine();
        String language = scanner.nextLine();

        System.out.println("\n" + language +" That's great. Nice chatting with you " + name + ". I have to log off now. See ya!");
        scanner.nextLine();
        //close scanner. 

        scanner.close();
    }
}
 