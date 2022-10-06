package com.linux.controller;

import com.linux.view.StringLiterals;

//TODO JAVA DOCS
public enum Commands {
  CHANGE_DIRECTORY("cd") {
    @Override
    public String description() {
      return literals.CD_DESCRIPTION;
    }

    @Override
    public void execute() {
// TODO: 10/5/2022
    }
  },
  CLEAR("clear") {
    @Override
    public String description() {
      return literals.CLEAR_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(literals.BLANK_SCREEN);
    }
  },
  EXIT("exit") {
    @Override
    public String description() {
      return literals.EXIT_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(literals.EXIT);
    }
  },
  HELP("help") {
    @Override
    public String description() {
      return literals.HELP_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(literals.HELP);
    }
  },
  LIST_DIRECTORIES("ls") {
    @Override
    public String description() {
      return literals.LS_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(literals.DIRECTORY_CONTENTS);
    }
  },
  PRINT_WORKING_DIRECTORY("pwd") {
    @Override
    public String description() {
      return literals.PWD_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(literals.PWD);
    }
  },
  TOUCH("touch") {
    @Override
    public String description() {
      return literals.TOUCH_DESCRIPTION;
    }

    @Override
    public void execute() {
      System.out.println(literals.TOUCH_INVALID);
    }
  };

  // TODO: 10/6/2022 delete line below and ctrl r all literals to StringLiterals
  private static final StringLiterals literals = new StringLiterals();
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
