import java.util.Scanner;

public class Main {
public static void imp(){
    Scanner input = new Scanner(System.in);
    Human human = new Human();
    //Basic Display and Inputs
    System.out.println("Hello! What is your name?");
    String name = input.nextLine();
    human.setName(name);
    System.out.println("Input an Email Address?  Example: Lovely@hotmail.com");
    String email = input.nextLine();
    human.setEmail(email);
    System.out.println("Can we get a phone number from you as well? (6**)*******");
    String number = input.nextLine();
    human.setNumber(number);
    System.out.println("Just a few more questions");
    System.out.println("What is your gender");
    String gender = input.nextLine();
    human.setGender(gender);
    System.out.println("How about the age?");
    String age = input.nextLine();
    human.setAge(age);
}

public static class Human{
    //variable initialization
    private String name;
    private String email;
    private String number;
    private String gender;
    private String age;
    public Human(){
    }
    // getters and setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    public String getAge() {return age;}
    public void setAge(String age) {this.age = age;}

    public Human(String name, String email, String number, String gender, String age) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.gender = gender;
        this.age = age;
    }
}

public static void main(String[] args){
    imp();
}
}
