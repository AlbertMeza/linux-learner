import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Terminal {

  private static final StringLiterals literals = new StringLiterals();
  private String command;
  private String hostName;

//  public void startTerminal(){       start method to implement
//    DateTimeGroup.datePrompt();
//    initiate get username data
//    while(command != Commands.EXIT){
//
//    }
//  }

  public void exit(){
    if (command.equals(Commands.EXIT.command())){
      System.out.println(literals.EXIT);
    }
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName() {
    BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter your User Name: " + System.in);
//    this.hostName = ;
  }


}
