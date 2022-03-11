import java.util.Scanner;

public class Main {
    ArrayList<Integer> usedNumbers = new ArrayList<Integer>(); //list of used boarding pass numbers
public static void imp(){
    //variable initialization
    String name;
    String email;
    String number;
    String gender;
    String age;
    int boardingnum;
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
    //getting the Boarding number
    boardingnum = generateBoardingNum();
}

/*
Only thing that will need to change in generateBoardingNum is that the arrayList usedNumbers will most
likely need to read everything on the file with all users' info, getting
all the boarding pass numbers from that, then doing this method.
Can't do it yet since idk where the file is yet
 */
public static int generateBoardingNum(){
    Random rand;
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
