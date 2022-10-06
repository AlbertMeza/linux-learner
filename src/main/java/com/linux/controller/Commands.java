package com.linux.controller;

import com.linux.view.StringLiterals;

/**
 * Enum class with two abstract methods for each command to call the execution and print the description of each.
 */
public enum Commands {
  CHANGE_DIRECTORY("cd") {
    @Override
    public String description() {
      return StringLiterals.CD_DESCRIPTION;
    }

    @Override
    public void execute() {
// TODO: 10/5/2022
    }
  },
  CLEAR("clear") {
    @Override
    public String description() {
      return StringLiterals.CLEAR_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(StringLiterals.CLEAR);
    }
  },
  EXIT("exit") {
    @Override
    public String description() {
      return StringLiterals.EXIT_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(StringLiterals.EXIT);
    }
  },
  HELP("help") {
    @Override
    public String description() {
      return StringLiterals.HELP_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(StringLiterals.HELP);
    }
  },
  LIST_DIRECTORIES("ls") {
    @Override
    public String description() {
      return StringLiterals.LS_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(StringLiterals.DIRECTORY_CONTENTS);
    }
  },
  PRINT_WORKING_DIRECTORY("pwd") {
    @Override
    public String description() {
      return StringLiterals.PWD_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(StringLiterals.PWD);
    }
  },
  TOUCH("touch") {
    @Override
    public String description() {
      return StringLiterals.TOUCH_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(StringLiterals.TOUCH_INVALID);
    }
  };

  private final String command;

  Commands(String command) {
    this.command = command;
  }

  public String toString() {
    String name = name().toLowerCase();
    StringBuilder printedName = new StringBuilder(("" + name.charAt(0)).toUpperCase());
    for(int i = 1; i < name.length(); i++){
      if(name.charAt(i) == '_') {
        printedName.append(' ');
      }
      else {
        printedName.append(name.charAt(i));
      }
    }
    return printedName.toString();
  }

  public String command() {
    return command;
  }

  public abstract String description();

  public abstract void execute();
}
