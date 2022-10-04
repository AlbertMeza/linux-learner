import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.*;

public class Terminal {

  private static final StringLiterals literals = new StringLiterals();
  private String command;
  public String userDetails = ""; //giovanni@SuperComputer

  public Terminal(){
    setUserDetails();
  }

  public void startTerminal(){
    DateTimeGroup.datePrompt();
    System.out.println(getUserDetails());
//    while(command != Commands.EXIT){
//
//    }
  }

  public void commandAction() {
    System.out.println("Please enter your next command: ");
    Scanner sc= new Scanner(System.in);
    switch (sc.next()){
      case "clear":
        clearCommand();
        break;
      case "exit":
        exit();
        break;
      case "ls":
        lsCommand();
        break;
      case "pwd":
        pwdCommand(sc.next());
        break;
      case "touch":
        touchCommand();
        break;
      default:
        System.out.println("Incorrect command");
    }

  }

  public void clearCommand () {
    System.out.println(literals.BLANKSCREEN);
  }

  public void exit(){
    System.out.println(literals.EXIT);
  }

  public void lsCommand() {
    System.out.println(getUserDetails() + literals.DIRECTORY_CONTENTS);
  }

  public void pwdCommand (String command) {
    Pattern p = Pattern.compile("D%@");
    Matcher m = p.matcher("D%@");

    while (m.find()) {
      System.out.println("find() found substring \"" + m.group()
          + "\" starting at index " + m.start()
          + " and ending at index " + m.end());
    }

    if (m.matches()) {
      System.out.println("matches() found substring \"" + m.group()
          + "\" starting at index " + m.start()
          + " and ending at index " + m.end());
    } else {
      System.out.println("matches() found nothing");
    }

    String match = "**";
    String matchResult = m.replaceFirst(match);
    System.out.println(literals.PWD + matchResult);
  }

  public void touchCommand () {
    System.out.println();
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
    System.out.println(literals.WELCOME + "/n");
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter your User Name: ");
    String username = sc.next();
    System.out.println("Please enter your Computer Name: ");
    String computerName = sc.next();
    userDetails = username+"@"+computerName + " ~ %";
    System.out.println(literals.BLANKSCREEN);
    }
}
