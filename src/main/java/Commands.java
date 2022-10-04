public enum Commands {
  CHANGE_DIRECTORY("cd") { //must have an internal state these commands execute against (Virtual file tracker made in a different class)
    @Override
    public String description() {
      return literals.CD_DESCRIPTION;
    }

    @Override
    public void execute() {

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
      //System.out.println(literals.TOUCH);
    }
  };


  private static final StringLiterals literals = new StringLiterals();
  private final String command;


  Commands(String command){
    this.command = command;
  }

  public String toString() {
    String name = name().toLowerCase();
    String printedName = ("" + name.charAt(0)).toUpperCase();
    for(int i = 1; i < name.length(); i++){
      if(name.charAt(i) == '_') {
        printedName += ' ';
      }
      else {
        printedName += name.charAt(i);
      }
    }
    return printedName;
  }

  public String command() {
    return command;
  }

  public abstract String description();

  public abstract void execute();
}
