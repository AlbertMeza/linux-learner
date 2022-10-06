package com.linux.model;

import com.linux.controller.Commands;
import com.linux.controller.Tasks;
import com.linux.view.DateTimeGroup;
import com.linux.view.StringLiterals;

import java.util.List;
import java.util.Scanner;

/**
 * Encapsulates the current state of a terminal simulation of Linux Learner
 */
public class Terminal {

  private final Directory directory = new Directory();
  private final List<String> homeDirectory = directory.getHomeDirectory(); //the home directory never changes from \Users\[username]
  private List<String> currentDirectory; //used to track the current directory
  /**
   * Allows us to use all StringLiterals from the StringLiteral class
   */
  /**
   * Default home directory is set to a standard home directory mimic
   */
  //private static final List<String> homeDirectory = Directory.homeDirectory();
  /**
   * Used to track the present working directory
   */
  //private List<String> currentDirectory;
  private String command = "";
  private String userName = "";
  private String computerName = "";

  private String pwdString = StringLiterals.PWD;

  /**
   * Initializes this instance with the specified configuration parameters. Once initialized, the
   * configuration of userName and computerName does not change.
   */
  public Terminal() {
    setUserDetails();
    setCurrentDirectory(homeDirectory);
  }

  /**
   * Updates the state of this instance by applying the specific user inputted command until {exit}
   * is entered
   */
  public void startTerminal() {
    System.out.println(StringLiterals.START_NOTE); // TODO: 10/6/2022 Changes worth merging.
    DateTimeGroup.datePrompt();
    Scanner sc = new Scanner(System.in);
    while (!command.equals(Commands.EXIT.command())) {
      System.out.print(getUserDetails() + StringLiterals.ACCESS_LEVEL);
      setCommand(sc.nextLine()); //talking point
      commandAction(getCommand());
    }
  }

  /**
   * Processes the user command
   *
   * @param command User inputted command to execute on the terminal
   */
  public void commandAction(
      String command) {  //cd Desktop -> splitCommand[0] = cd, splitCommand[1] = Desktop //TODO put the switch statement in ABC order
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
      switch (command) {
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
        case "task1":
          Tasks.TASK_ONE.execute();
          break;
        case "task2":
          Tasks.TASK_TWO.execute();
          break;
        case "task3":
          Tasks.TASK_THREE.execute();
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
  public void commandDescription(String command) {
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

  /**
   * Attempts to update the directory with the file Error message prints out if file already exists
   *
   * @param file User inputted file to create on the terminal
   */
  public void addToDirectory(String file) {
    if (currentDirectory.contains(file)) {
      System.out.printf(StringLiterals.FILE_ERROR,
          file); //TODO change to string literal, also look up unix terminal error
    } else {
      currentDirectory.add(file);
    }
  }

  /**
   * @param dir User inputted directory to change present working directory
   */
  public void changeDirectory(String dir) {
    if (dir.equals("~")) {
      setCurrentDirectory(homeDirectory);
      setPwdString(homePWD());
    } else if (getCurrentDirectory().contains(dir)) {
      //cd
      switch (dir) {
        case "Desktop": //TODO encapsulate these and look at them to see if you guys want changes into any of these
          setCurrentDirectory(Directory.changeDirectory(dir));
          break;
        case "Pictures":
          setCurrentDirectory(Directory.createPictureDirectory());
          break;
        case "Public":
          setCurrentDirectory(Directory.publicDirectory());
          break;
        case "Documents":
          setCurrentDirectory(Directory.documentDirectory());
          break;
        case "Downloads":
          setCurrentDirectory(Directory.downloadDirectory());
          break;
        case "Library":
          setCurrentDirectory(Directory.libraryDirectory());
          break;
        case "Movies":
          setCurrentDirectory(Directory.moviesDirectory());
          break;
        default:
          break;
      }
      //change pwd
      setPwdString(homePWD() + dir + "/");
    } else {
      System.out.println(StringLiterals.INVALID_CD + dir);
    }
  }

  public String homePWD() {
    return StringLiterals.PWD + getUserName() + "/";
  }


  public List<String> getCurrentDirectory() {
    return this.currentDirectory;
  }


  private void setCurrentDirectory(List<String> currentDirectory) {
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
    return getUserName() + "@" + getComputerName();
  }

  private void setUserDetails() { //this acts as the setter for both userName and computerName
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
    System.out.println(StringLiterals.BLANK_SCREEN);
  }


}
