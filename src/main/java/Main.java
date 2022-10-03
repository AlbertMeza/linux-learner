public class Main {

  public static void main(String[] args) {
    System.out.println(Commands.PRINT_WORKING_DIRECTORY); //toString
    System.out.println(Commands.PRINT_WORKING_DIRECTORY.command());
    System.out.println();

    Terminal terminal = new Terminal();
    terminal.setCommand("exit");
    terminal.exit();
  }
}
