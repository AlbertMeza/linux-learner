import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Format;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.*;

public class Terminal {

  private static final StringLiterals literals = new StringLiterals();
  private String command;
  private String userName = "";
  private String computerName = "";

  public Terminal(){
    setUserDetails();
    System.out.println(literals.BLANK_SCREEN);
    startTerminal();
  }

  public String getUserDetails() {
    return getUserName()+"@"+getComputerName();
  }

  public void startTerminal(){
    DateTimeGroup.datePrompt();
    Scanner sc = new Scanner(System.in);
    setCommand(sc.next());
    while(!command.equals(Commands.EXIT.command())){
      System.out.print(getUserDetails() + literals.ACCESS_LEVEL);
      setCommand(sc.next());
      commandAction(getCommand());
    }
  }

  public void commandAction(String command) {
    switch (command) {
      case "clear":
        Commands.CLEAR.execute();
        break;
      case "ls":
        Commands.LIST_DIRECTORIES.execute();
        break;
      case "pwd":
        System.out.printf("%s%s%n", literals.PWD, getUserName());
        break;
      case "exit":
        Commands.EXIT.execute();
        break;
      case "touch":
        System.out.println("You need to specify what you want to use with the touch command.");
        break;
      case "touch file":
        Commands.TOUCH.execute();
        break;
      default:
        System.out.println("Incorrect Command");

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
    System.out.println(literals.USER_PROMPT);
    String userName = sc.next();
    System.out.println(literals.COMPUTER_PROMPT);
    String computerName = sc.next();
    this.userName = userName;
    this.computerName = computerName;
    System.out.println(literals.BLANK_SCREEN);
  }
}
