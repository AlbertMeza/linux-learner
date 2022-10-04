public enum Commands {
  CHANGE_DIRECTORY("cd"),
  CLEAR("clear"),
  EXIT("exit"),
  LIST_DIRECTORIES("ls"),
  PRINT_WORKING_DIRECTORY("pwd"),
  TOUCH("touch");



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
}
