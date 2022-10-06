package com.linux.view;

//TODO Javadocs
public class StringLiterals {

  //Terminal
  public static final String ACCESS_LEVEL = (" ~ % ");

  public static final String BLANK_SCREEN = ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

  public static final String COMPUTER_PROMPT = ("Please enter your Computer Name: ");

  public static final String START_NOTE = ("Try completing our tasks, find the tasks by entering {task1} {task2} {task3}.\nIf unknown where to start enter {help} for clues");

  public static final String TASK_ONE = ("Try to find our movie watchlist in the Movies Directory");

  public static final String TASK_TWO = ("We have several books in our Library Directory, can you add one of your favorites?");

  public static final String TASK_THREE = ("Navigate to any directory of your choice. Can you get back home? Can you verify your current working directory.");

  public static final String USER_PROMPT = ("Please enter your User Name: ");

  public static final String WELCOME = ("Hello! Welcome to Linux Learner. If you are new to the Linux Command line then this is the place for you.\nIf you are not a Linux beginner, then let's test your knowledge with some tasks!");

  //Command Executables
  public static final String DIRECTORY_CONTENTS = ("Pictures Desktop Public Documents Downloads Library Movies");

  public static final String EXIT = ("Saving session...\n...copying shared history..\n...saving history...truncating history files...\n...completed.\n\n[Process completed]");

  public static final String HELP = ("To use the help command, 'help' must be followed by: cd, clear, ls, pwd, touch, or exit");

  public static final String PWD = ("/Users/");

  //Command Descriptions
  public static final String CD_DESCRIPTION = ("Change Directory (cd): Change the current directory user is in to requested directory\nNote: user may not have permissions to access all directories");

  public static final String CLEAR_DESCRIPTION = ("Clear (clear): clears the screen, does not remove any data currently or previously used");

  public static final String EXIT_DESCRIPTION = ("Exit (exit): Disconnects ssh user and Exits the terminal");

  public static final String HELP_DESCRIPTION = ("Help (help): Gives a user an explanation of the commands");

  public static final String LS_DESCRIPTION = ("List Directory Contents (ls):  List information about the files (the current directory by default).\nSort entries alphabetically if no order specified");

  public static final String PWD_DESCRIPTION = ("Print Working Directory (pwd): Print the full filename of the current working directory");

  public static final String TOUCH_DESCRIPTION = ("Touch (touch): Update the access and modification times of each file to the current time \nA file argument that does not exist is created empty");
  // TODO: 10/6/2022 Changes worth merging.
  //Invalid Messages
  public static final String FILE_ERROR = ("This directory already has a file named %s\n");

  public static final String HELP_INVALID = ("help for that command is not available. You may use cd, clear, ls, pwd, touch, or exit");

  public static final String INVALID_CD = ("cd: no such file or directory: ");

  public static final String INVALID_COMMAND = ("Incorrect Command");

  public static final String TOUCH_INVALID = ("You need to specify what you want to use with the touch command");

  //tasks descriptions
  public static final String TASK_ONE_TUTORIAL = ("To find the Movies Directory it is best to know the current directory.\n{pwd} Will print the current working directory.\n"
      + "Now you need to change from the current directory to Movies.\n"
      + "{cd Movies} translates to Change Directory: Movies."
      + "\nYou made it! While you're here, try {ls} to see the movies available.\nGood job! use {cd ~} to return home.");

  public static final String TASK_TWO_TUTORIAL =("To find the Library Directory it is best to know the current directory.\n{pwd} Will print the current working directory.\n"
      + "Now you need to change from the current directory to Library, {cd Library}.\n"
      + "Use the {ls} command to see what books are currently listed.\nYou can't recreate a file with the same name, so make sure you pick a book not already listed."
      + "\n{touch 'yourBookNameHere'} to create your book in the Library Directory. Now {ls} to verify it is there."
      + "\nGood job! use {cd ~} to return home.");

  public static final String TASK_THREE_TUTORIAL = ("From the home Directory, use command {ls} to see what other directories are listed."
      + "\nNow you can enter a different directory using {cd 'nameOfDirectory'}.\nNow you are free to explore! {ls} to see whats in the selected directory, and then return to the home directory."
      + "\n{cd ~} will bring you home. {pwd} to verify the current directory is home user." );

}
