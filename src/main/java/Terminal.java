public class Terminal {

  private static final StringLiterals literals = new StringLiterals();
  private String command;

//  public void startTerminal(){       start method to implement
//    initiate the DTG support
  //  initiate get username data
//    while(command != Commands.EXIT){
//
//    }
//  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public void exit(){
    if (command.equals(Commands.EXIT.command())){
      System.out.println(literals.EXIT);
    }
  }

}
