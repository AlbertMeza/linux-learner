package com.linux.model;

import com.linux.controller.Commands;
import com.linux.controller.Tasks;
import com.linux.view.DateTimeGroup;
import com.linux.view.StringLiterals;
import java.util.List;
import java.util.Scanner;

/**
 *  Encapsulates the current state of a terminal simulation of Linux Learner
 */
public class Terminal {

  private final Directory directory = new Directory();
  /**
   * Sets the homeDirectory as \Users\[username]\
   */
  private final List<String> homeDirectory = directory.getHomeDirectory();
  /**
   * Used to track the present working directory
   */
  private List<String> currentDirectory;

  private String command = "";
  private String userName = "";
  private String computerName = "";

  private String pwdString = StringLiterals.PWD;

  /**
   * Initializes this instance with the specified configuration parameters. Once initialized, the
   * configuration of userName and computerName does not change.
   */
  public Terminal(){
    setCurrentDirectory(homeDirectory);
  }

  /**
   * Updates the state of this instance by applying the specific user inputted command until {exit} is entered
   */
  public void startTerminal(){
    setUserDetails();
    System.out.println(StringLiterals.START_NOTE);
    System.out.println(DateTimeGroup.datePrompt());
    Scanner sc = new Scanner(System.in);
    while(!command.equals(Commands.EXIT.command())){
      System.out.print(getUserDetails() + StringLiterals.ACCESS_LEVEL);
      setCommand(sc.nextLine());
      commandAction(getCommand());
    }
  }

  /**
   * Processes the user command
   *
   * @param command User inputted command to execute on the terminal
   */
  private void commandAction(String command) {  //cd Desktop -> splitCommand[0] = cd, splitCommand[1] = Desktop
    if (command.contains(" ")) { //multi commands
      String[] splitCommand = command.split("\\s");
      String commandOne = splitCommand[0];
      String commandTwo = splitCommand[1];

      switch (commandOne) {
        case "touch":
          addToDirectory(commandTwo);
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
      switch (command) {
        case "clear":
          Commands.CLEAR.execute();
          break;
        case "ls":
          System.out.println(directory.printDirectory(getCurrentDirectory()));
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
        case "task1":
          System.out.println(Tasks.TASK_ONE.task());
          break;
        case "task2":
          System.out.println(Tasks.TASK_TWO.task());
          break;
        case "task3":
          System.out.println(Tasks.TASK_THREE.task());
          break;
        default:
          System.out.println(StringLiterals.INVALID_COMMAND);
      }
    }
  }

  /**
   * "help {command}" inputted by the user will print out a layman's description of the command
   *
   * @param command User inputted command to execute on the terminal
   */
  void commandDescription(String command) {
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
      case "task1":
        System.out.println(Tasks.TASK_ONE.tutorial());
        break;
      case "task2":
        System.out.println(Tasks.TASK_TWO.tutorial());
        break;
      case "task3":
        System.out.println(Tasks.TASK_THREE.tutorial());
        break;
      default:
        System.out.println(StringLiterals.HELP_INVALID);
    }
  }

  /**
   * Attempts to update the directory with the file
   * Error message prints out if file already exists
   *
   * @param file User inputted file to create on the terminal
   */
  private void addToDirectory(String file) {
    if (currentDirectory.contains(file)) {
      System.out.printf(StringLiterals.FILE_ERROR,
          file);
    } else {
      currentDirectory.add(file);
    }
  }

  /**
   * Alters the present working directory
   *
   * @param dir User inputted directory to change present working directory
   */
  void changeDirectory(String dir){
    if (dir.equals("~")){
      setCurrentDirectory(homeDirectory);
      setPwdString(homePWD());
    }
    else if(getCurrentDirectory().contains(dir)){
      //cd
      setCurrentDirectory(directory.switchDirectory(dir));
      //change pwd
      setPwdString(homePWD()+dir+"/");
    }
    else {
      System.out.println(StringLiterals.INVALID_CD + dir);
    }
  }

  /**
   * Used to set the userName and computerName of the session
   */
  private void setUserDetails() {
    System.out.println(StringLiterals.WELCOME);
    System.out.println();
    Scanner sc = new Scanner(System.in);
    System.out.println(StringLiterals.USER_PROMPT);
    String userName = sc.next();
    System.out.println(StringLiterals.COMPUTER_PROMPT);
    String computerName = sc.next();
    setUserName(userName);
    setPwdString(homePWD());
    setComputerName(computerName);
    System.out.println(StringLiterals.CLEAR);
  }

  private String homePWD(){
    return StringLiterals.PWD + getUserName() + "/";
  }

  List<String> getCurrentDirectory() {
    return this.currentDirectory;
  }

  private void setCurrentDirectory(List<String> currentDirectory) {
    this.currentDirectory = currentDirectory;
  }

  private String getCommand() {
    return command;
  }

  private void setCommand(String command) {
    this.command = command;
  }

  private String getUserName() {
    return userName;
  }

  private void setUserName(String userName) {
    this.userName = userName;
  }

  private String getComputerName() {
    return computerName;
  }

  private void setComputerName(String computerName) {
    this.computerName = computerName;
  }

  private String getPwdString() {
    return pwdString;
  }

  private void setPwdString(String pwdString) {
    this.pwdString = pwdString;
  }

  private String getUserDetails() {
    return getUserName() + "@" + getComputerName();
  }

}
