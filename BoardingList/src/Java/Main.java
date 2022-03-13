import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Charset utf8 = StandardCharsets.UTF_8;
    static ArrayList<Integer> usedNumbers = new ArrayList<Integer>(); //list of used boarding pass numbers
   //creates the file PER USER for each run-through
    //creates the OVERALL file to keep records of ALL USERS created using this program.


//runs the prompt for user input, storing all the information in a new human Object.
    public static void imp(){
    Scanner input = new Scanner(System.in);
    Human human = new Human();
    int boardingnum;
    //Basic Display and Inputs
    System.out.println("Hello! What is your name?");
    String name = input.nextLine();
    human.setName(name);
    System.out.println("Input an Email Address?  Example: Lovely@hotmail.com");
    String email = input.nextLine();
    human.setEmail(email);
    System.out.println("Can we get a phone number from you as well? 6**-***-****");
    String number = input.nextLine();
    human.setNumber(number);
    System.out.println("Just a few more questions");
    System.out.println("What is your gender Ex. Male, Female, Other");
    String gender = input.nextLine();
    human.setGender(gender);
    System.out.println("How about the age?");
    String age = input.nextLine();
    human.setAge(age);
    System.out.println("When do you plan on leaving? Ex. 01-25-2023 (Month-Day-Year)");
    String date = input.nextLine();
    human.setDate(date);
    System.out.println("Where do you plan on travelling to?");
    String dest = input.nextLine();
    human.setDest(dest);
    System.out.println(human);
    boardingnum = generateBoardingNum();
        try {
        Files.write(Paths.get("userFile.txt"), (Iterable<? extends CharSequence>) human,utf8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
        Files.write(Paths.get("shareFile.txt"), (Iterable<? extends CharSequence>) human,utf8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    } catch (IOException e) {
        e.printStackTrace();
    }

}

//everything that Is important to the Human object initialization
public static class Human {
    //variable initialization
    private String name;
    private String email;
    private String number;
    private String gender;
    private String age;
    private String date;
    private String dest;

    public Human() {
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDest() {
        return dest;
    }
    public void setDest(String dest) {
        this.age = dest;
    }

    public Human(String name, String email, String number, String gender, String age,String date,String dest) {
        this.name = name;
        this.email = email;
        this.number = number;
        this.gender = gender;
        this.age = age;
        this.date = date;
        this.dest = dest;
    }
}

    /*
    Only thing that will need to change in generateBoardingNum is that the arrayList usedNumbers will most
    likely need to read everything on the file with all users' info, getting
    all the boarding pass numbers from that, then doing this method.
    Can't do it yet since idk where the file is yet
     */
    public static int generateBoardingNum(){
        Random rand = new Random();
        int passNum = rand.nextInt((9999-1000)+1)+1000; //random int that's 4 digits
        boolean used = false;
        for (int i : usedNumbers){ //check to see if it's been used before.
            if (i == passNum){
                used = true;
                break;
            }
        }
        if (!used){ //if not used, add to list
            usedNumbers.add(passNum);
            return passNum;
        }else { //else, try this again and return that number
            return generateBoardingNum();
        }
    }


public static void main(String[] args){
    imp();
}
}
