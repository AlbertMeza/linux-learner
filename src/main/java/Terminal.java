import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Terminal {

  private static final StringLiterals literals = new StringLiterals();
  private String command;
  private String userDetails = ""; //giovanni@SuperComputer

  public Terminal(){
    setUserDetails();
    //startTerminal();
  }

  public void startTerminal(){
    DateTimeGroup.datePrompt();
    System.out.println(getUserDetails() + " ~ %");
//    while(command != Commands.EXIT){
//
//    }
  }

  public void exit(){
    if (command.equals(Commands.EXIT.command())){
      System.out.println(literals.EXIT);
    }
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getUserDetails() {
    return this.userDetails;
  }

  public void setUserDetails() {
    System.out.println(literals.WELCOME);
    System.out.println();
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter your User Name: ");
    String username = sc.next();
    System.out.println("Please enter your Computer Name: ");
    String computerName = sc.next();
    this.userDetails = username+"@"+computerName;
    System.out.println(literals.BLANKSCREEN);
  }



}
