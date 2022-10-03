import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hostname {

 // order in fields, constructors, methods
 private final String welcome = "Hello! Welcome to Linux Learner. If you are new to the Linux Command line then this is the place for you."
     + "%n If you are not a Linux beginner, then let's test your knowledge with some tasks!";

 private final String computer = "-current-Computer ~ % ";

  public Hostname() { //ctor

  }
  private String userName() {
   BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Please enter your User Name: " + System.in);
  }return "return";//(System.in + computer);


  //parse username



 /*Scanner myObj = new Scanner(System.in);  // Create a Scanner object
   System.out.println("Enter username");

 String userName = myObj.nextLine();  // Read user input
   System.out.println("Username is: " + userName);  // Output user input*/
}


