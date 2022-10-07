package com.linux.view;

/**
 * A class to hold all of our CONSTANT statements
 */
public class StringLiterals {

  //Terminal
  public static final String ACCESS_LEVEL = (" ~ % ");

  public static final String CLEAR = ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

  public static final String COMPUTER_PROMPT = ("Please enter your Computer Name: ");

  public static final String START_NOTE = ("Try completing our tasks, find the tasks by entering {task1} {task2} {task3}.\nIf you get stuck, you can enter {help} for clues.\n");

  public static final String TASK_ONE = ("Try to find our movie watchlist in the Movies Directory.");

  public static final String TASK_TWO = ("We have several books in our Library Directory, can you add one of your favorites?");

  public static final String TASK_THREE = ("Navigate to any directory of your choice. Can you get back home? Can you verify your current working directory.");

  public static final String USER_PROMPT = ("Please enter your User Name: ");

  public static final String WELCOME = ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nHello! Welcome to Linux Learner. If you are new to the Linux command line then this is the place for you.\nIf you are not a Linux beginner, then jump straight into the tasks to test your knowledge!");

  //Command Executables
  public static final String DIRECTORY_CONTENTS = ("Pictures Desktop Public Documents Downloads Library Movies");

  public static final String EXIT = ("Saving session...\n...copying shared history..\n...saving history...truncating history files...\n...completed.\n\n[Process completed]");

  public static final String HELP = ("To use the help command, {help} must be followed by: cd, clear, ls, pwd, touch, or exit.");

  public static final String PWD = ("/Users/");

  //Command Descriptions
  public static final String CD_DESCRIPTION = ("Change Directory (cd): Change the current directory to new directory.\nNote: user may not have permissions to access all directories.");

  public static final String CLEAR_DESCRIPTION = ("Clear (clear): clears the screen, does not remove any data currently or previously used.");

  public static final String EXIT_DESCRIPTION = ("Exit (exit): Disconnects ssh user and Exits the terminal.");

  public static final String HELP_DESCRIPTION = ("Help (help): Gives a user an explanation of the commands.");

  public static final String LS_DESCRIPTION = ("List Directory Contents (ls):  List information about the files (the current directory by default).\nSort entries alphabetically if no order specified.");

  public static final String PWD_DESCRIPTION = ("Print Working Directory (pwd): Print the full filename of the current working directory.");

  public static final String TOUCH_DESCRIPTION = ("Touch (touch): Update the access and modification times of each file to the current time.\nA file argument that does not exist is created as an empty file.");

  //Invalid Messages
  public static final String FILE_ERROR = ("This directory already has a file named %s\n");

  public static final String HELP_INVALID = ("help for that command is not available. You may use cd, clear, ls, pwd, touch, or exit.");

  public static final String INVALID_CD = ("cd: no such file or directory: ");

  public static final String INVALID_COMMAND = ("Incorrect Command");

  public static final String TOUCH_INVALID = ("You need to specify what you want to use with the touch command.");

  //tasks descriptions
  public static final String TASK_ONE_TUTORIAL =(
        "Step 1. To find the Movies Directory it is best to know the current directory.\n"
      + "Step 2. Use {pwd} to print the current working directory.\n"
      + "Step 3. Now you need to change from the current directory to Movie Directory.\n"
      + "Step 4. Use {cd Movies} to move to the Movie Directory.\n"
      + "Step 5. You made it! While you're here, try {ls} to see the movies available.\n"
      + "Good job! use {cd ~} to return home.");

  public static final String TASK_TWO_TUTORIAL =(
        "Step 1. To find the Library Directory it is best to know the current directory.\n"
      + "Step 2. Using {pwd} will print the current working directory.\n"
      + "Step 3. Use {cd Library} to move to the Library Directory.\n"
      + "Step 4. Use {ls} to see what books are currently listed.\n"
      + "Step 5. You can't recreate a file with the same name, so make sure you pick a book not already listed.\n"
      + "Step 6. Use {touch 'yourBookNameHere'} to create your book in the Library Directory.\n"
      + "Step 7. Now use {ls} to verify it is there.\n"
      + "Good job! use {cd ~} to return home.");

  public static final String TASK_THREE_TUTORIAL =(
        "Step 1. From the Home Directory, use {ls} to see the existing directories.\n"
      + "Step 2. To change directory use {cd 'nameOfDirectory'}.\n"
      + "Step 3. Now you are free to explore! Use {ls} to see whats in the selected directory.\n"
      + "Step 4. Return to the home directory by using {cd ~}.\n"
      + "Step 5. Use {pwd} to verify the current directory is home user." );

}
