import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Terminal {

  private static final StringLiterals literals = new StringLiterals();
  private String command;
  private String userName = "";
  private String computerName = "";
  public Terminal(){
    setUserDetails();
    System.out.println(literals.BLANKSCREEN);
    startTerminal();
  }

  public String getUserDetails() {
    return getUserName()+"@"+getComputerName();
  }

  public void startTerminal(){
    DateTimeGroup.datePrompt();
    System.out.print(getUserDetails() + " ~ %");
    Scanner sc = new Scanner(System.in);
    setCommand(sc.next());
    while(!command.equals(Commands.EXIT.command())){
      System.out.print(getUserDetails() + " ~ %");
      setCommand(sc.next());
    }
    exit();
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

  private String getUserName() {
    return userName;
  }

  private String getComputerName() {
    return computerName;
  }

  private void setUserDetails() {
    System.out.println(literals.WELCOME);
    System.out.println();
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter your User Name: ");
    String userName = sc.next();
    System.out.println("Please enter your Computer Name: ");
    String computerName = sc.next();
    this.userName = userName;
    this.computerName = computerName;
    System.out.println(literals.BLANKSCREEN);
  }



}
