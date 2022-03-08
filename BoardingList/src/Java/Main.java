import java.util.Scanner;

public class Main {
public static void imp(){
    //variable initialization
    String name;
    String email;
    String number;
    String gender;
    String age;
    Scanner input = new Scanner(System.in);

    //Basic Display and Inputs
    System.out.println("Hello! What is your name?");
    name = input.nextLine();
    System.out.println("Input an Email Address?  Example: Lovely@hotmail.com");
    email = input.nextLine();
    System.out.println("Can we get a phone number from you as well? (6**)*******");
    number = input.nextLine();
    System.out.println("Just a few more questions");
    System.out.println("What is your gender");
    gender = input.nextLine();
    System.out.println("How about the age?");
    age = input.nextLine();
}

public static void main(String[] args){
    imp();
}
}
