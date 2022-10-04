import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.*;

public class Terminal {

  private static final StringLiterals literals = new StringLiterals();
  private static final LinkedList<String> homeDirectory = Directory.createHomeDirectory();
  private LinkedList<String> currentDirectory;
  private String command = "";
  private String userName = "";
  private String computerName = "";
  public Terminal(){
    setUserDetails();
    setCurrentDirectory(Directory.createHomeDirectory());
    startTerminal();
  }

  public String getUserDetails() {
    return getUserName()+"@"+getComputerName();
  }

  public void startTerminal(){
    DateTimeGroup.datePrompt();
    Scanner sc = new Scanner(System.in);
    while(!command.equals(Commands.EXIT.command())){
      System.out.print(getUserDetails() + literals.ACCESS_LEVEL);
      setCommand(sc.next());
      commandAction(getCommand());
    }
  }

  public void commandAction(String command) {  //cd Desktop -> splitCommand[0] = cd, splitCommand[1] = Desktop
    String splitCommand[] = command.split("\\s",2);
    switch (splitCommand[0]) {
      case "clear":
        Commands.CLEAR.execute();
        break;
     case "ls":
        Commands.LIST_DIRECTORIES.execute();
        break;
      case "pwd":
        System.out.printf("%s%s%n", literals.PWD, getUserName());
        break;
      case "touch":
        System.out.println("You need to specify what you want to use with the touch command.");
        break;
      case "exit":
        Commands.EXIT.execute();
        break;
      default:
        System.out.println("Incorrect command");
    }
  }

  //if(help) is used then they can type the commmand they want help with down below



  public void commandDescription(String command) { //intended to be used as a help desk
    switch (command) {
      case "clear":
        Commands.CLEAR.description();
        break;
      case "ls":
        Commands.LIST_DIRECTORIES.description();
        break;
      case "pwd":
        Commands.PRINT_WORKING_DIRECTORY.description();
        break;
      case "touch":
        Commands.TOUCH.description();
        break;
      case "exit":
        Commands.EXIT.description();
        break;
      default:
        System.out.println("help for that command is not available. You may use clear, ls, pwd, touch, or exit");
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

  public LinkedList<String> getCurrentDirectory() {
    return this.currentDirectory;
  }

  private void setCurrentDirectory(LinkedList<String> currentDirectory) {
    this.currentDirectory = currentDirectory;
  }


}
