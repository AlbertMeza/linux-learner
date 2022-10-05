package com.linux.model;

import com.linux.controller.Commands;
import com.linux.view.DateTimeGroup;
import com.linux.view.StringLiterals;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


//TODO need a javadocs description
public class Terminal {

  private final Directory directory = new Directory();
  private final List<String> homeDirectory = directory.getHomeDirectory(); //the home directory never changes from \Users\[username]
  private LinkedList<String> currentDirectory; //used to track the current directory
  private String command = "";
  private String userName = "";
  private String computerName = "";

  private String pwdString = StringLiterals.PWD;

  public Terminal(){
    setUserDetails();
    setCurrentDirectory(homeDirectory);
  }

  public void startTerminal(){
    System.out.println("if unknown where to start try {help} then enter"); //TODO customize this
    DateTimeGroup.datePrompt();
    Scanner sc = new Scanner(System.in);
    while(!command.equals(Commands.EXIT.command())){
      System.out.print(getUserDetails() + StringLiterals.ACCESS_LEVEL);
      setCommand(sc.nextLine()); //talking point
      commandAction(getCommand());
    }
  }

  /**
   *
   * @param command
   */
  public void commandAction(String command) {  //cd Desktop -> splitCommand[0] = cd, splitCommand[1] = Desktop //TODO put the switch statement in ABC order
    if (command.contains(" ")) { //multi commands
      String[] splitCommand = command.split("\\s");
      String commandOne = splitCommand[0];
      String commandTwo = splitCommand[1];

      switch (commandOne) {
        case "touch":
          addToDirectory(commandTwo); //maybe talk rules here, add logic
          break;
        case "help":
          commandDescription(commandTwo);
          break;
        case "cd":
          changeDirectory(commandTwo);
          break;
        default:
          System.out.println(StringLiterals.INVALID_COMMAND);
      }
    } else { //solo command
      switch (command) { //TODO discuss a {help me} command
        case "clear":
          Commands.CLEAR.execute();
          break;
        case "ls":
          System.out.println(Directory.printDirectory(currentDirectory));
          break;
        case "pwd":
          System.out.println(getPwdString());
          break;
        case "exit":
          Commands.EXIT.execute();
          break;
        case "help":
          Commands.HELP.execute();
          break;
        case "touch":
          Commands.TOUCH.execute();
          break;
        default:
          System.out.println(StringLiterals.INVALID_COMMAND);
      }
    }
  }

  public void commandDescription(String command) { //TODO abc order
    switch (command) {
      case "cd":
        System.out.println(Commands.CHANGE_DIRECTORY.description());
        break;
      case "clear":
        System.out.println(Commands.CLEAR.description());
        break;
      case "exit":
        System.out.println(Commands.EXIT.description());
        break;
      case "help":
        System.out.println(Commands.HELP.description());
        break;
      case "ls":
        System.out.println(Commands.LIST_DIRECTORIES.description());
        break;
      case "pwd":
        System.out.println(Commands.PRINT_WORKING_DIRECTORY.description());
        break;
      case "touch":
        System.out.println(Commands.TOUCH.description());
        break;
      default:
        System.out.println(StringLiterals.HELP_INVALID);
    }
  }

  public void addToDirectory(String file){
    if(currentDirectory.contains(file)){
      System.out.printf(StringLiterals.FILE_ERROR, file); //TODO change to string literal, also look up unix terminal error
    }
    else {
      currentDirectory.add(file);
    }
  }

  public void changeDirectory(String dir){
    if (dir.equals("~")){
      setCurrentDirectory(homeDirectory);
      setPwdString(homePWD());
    }
    else if(getCurrentDirectory().contains(dir)){
      //cd
      switch(dir) {
        case "Desktop": //TODO encapsulate these and look at them to see if you guys want changes into any of these
          setCurrentDirectory(Directory.changeDirectory(dir));
          break;
        case "Pictures":
          currentDirectory = Directory.createPictureDirectory();
          break;
        case "Public":
          currentDirectory = Directory.createPublicDirectory();
          break;
        case "Documents":
          currentDirectory = Directory.createDocumentsDirectory();
          break;
        case "Downloads":
          currentDirectory = Directory.createDownloadsDirectory();
          break;
        case "Library":
          currentDirectory = Directory.createLibraryDirectory();
          break;
        case "Movies":
          currentDirectory = Directory.createMoviesDirectory();
          break;
        default:
          break;
      }
      //change pwd
      setPwdString(homePWD()+dir+"/");
    }
    else {
      System.out.println(StringLiterals.INVALID_CD + dir); //TODO also look up unix terminal error for matching
    }
  }

  public String homePWD(){
    return StringLiterals.PWD + getUserName() + "/";
  }


  public LinkedList<String> getCurrentDirectory() {
    return this.currentDirectory;
  }


  private void setCurrentDirectory(LinkedList<String> currentDirectory) {
    this.currentDirectory = currentDirectory;
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

  public void setUserName(String userName) {
    this.userName = userName;
  }

  private String getComputerName() {
    return computerName;
  }
  public void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  public String getPwdString() {
    return pwdString;
  }

  public void setPwdString(String pwdString) {
    this.pwdString = pwdString;
  }
  public String getUserDetails() {
    return getUserName()+"@"+getComputerName();
  }

  private void setUserDetails() { //this acts as the setter for both userName and computerName
    System.out.println(StringLiterals.WELCOME);
    System.out.println();
    Scanner sc= new Scanner(System.in);
    System.out.println(StringLiterals.USER_PROMPT);
    String userName = sc.next();
    System.out.println(StringLiterals.COMPUTER_PROMPT);
    String computerName = sc.next();
    setUserName(userName);
    setPwdString(homePWD());
    setComputerName(computerName);
    System.out.println(StringLiterals.BLANK_SCREEN);
  }


}
