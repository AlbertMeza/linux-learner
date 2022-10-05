package com.linux.model;

//TODO Javadocs
public class StringLiterals { //TODO 1) categorize them 2) ABC by category

  //Terminal
  public final String ACCESS_LEVEL = (" ~ % ");
  public final String BLANK_SCREEN = ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

  public final String COMPUTER_PROMPT = ("Please enter your Computer Name: ");

  public final String HELP_INVALID = ("help for that command is not available. You may use clear, ls, pwd, touch, or exit");

  public final String INVALID_CD = ("cd: no such file or directory: ");

  public final String INVALID_COMMAND = ("Incorrect Command");

  public final String TOUCH_INVALID = ("You need to specify what you want to use with the touch command.");

  public final String USER_PROMPT = ("Please enter your User Name: ");

  public final String WELCOME = ("Hello! Welcome to Linux Learner. If you are new to the Linux Command line then this is the place for you.\nIf you are not a Linux beginner, then let's test your knowledge with some tasks!");

  //Command Executables
  public final String DIRECTORY_CONTENTS = ("Pictures Desktop Public Documents Downloads Library Movies");

  public final String EXIT =("Saving session...\n...copying shared history..\n...saving history...truncating history files...\n...completed.\n\n[Process completed]");

  public final String HELP = ("To use the help command, 'help' must be followed by: clear, ls, pwd, touch, or exit");

  public final String PWD = ("/Users/");

  //Command Descriptions
  public final String CD_DESCRIPTION = ("Change Directory (cd): Change the current directory user is in to requested directory.\n Note: user may not have permissions to access all Directories");

  public final String CLEAR_DESCRIPTION = ("Clear: clears the screen, does not remove any data currently or previously used. ");

  public final String EXIT_DESCRIPTION = ("Exit: Disconnects ssh user and Exits the terminal.");

  public final String HELP_DESCRIPTION = ("Help: Gives a user an explanation of the commands.");

  public final String LS_DESCRIPTION = ("List Directory Contents (ls):  List information about the FILEs (the current directory by default).\n Sort entries alphabetically if no order specified");

  public final String PWD_DESCRIPTION = ("Print Working Directory (pwd): Print the full filename of the current working directory.");

  public final String TOUCH_DESCRIPTION = ("Update the access and modification times of each FILE to the current time. \n A FILE argument that does not exist is created empty\n");//TODO clean these up



}
