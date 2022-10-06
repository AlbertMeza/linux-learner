package com.linux;

import static org.junit.jupiter.api.Assertions.*;

import com.linux.model.Terminal;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TerminalMainTest {

  public static Stream<Arguments> commandDescriptionCasesSource() {
    return Stream.of(
      Arguments.of("cd", "Change Directory (cd): Change the current directory user is in to requested directory\n Note: user may not have permissions to access all Directories"),
      Arguments.of("clear", "Clear: clears the screen, does not remove any data currently or previously used "),
      Arguments.of("exit", "Exit: Disconnects ssh user and Exits the terminal"),
      Arguments.of("help","Help: Gives a user an explanation of the commands"),
      Arguments.of("ls","List Directory Contents (ls):  List information about the FILEs (the current directory by default).\n Sort entries alphabetically if no order specified"),
      Arguments.of("pwd","Print Working Directory (pwd): Print the full filename of the current working directory"),
      Arguments.of("touch","Update the access and modification times of each FILE to the current time \n A FILE argument that does not exist is created empty\n")
    );
  }


//  void commandsTest(String command, String expected) {
//    String input = Terminal.commandAction(command);
//    assertEquals(expected, input);
//  }

  @Test
  void startTerminal() {

  }

  @Test
  void commandAction() {

  }

  @ParameterizedTest
  @MethodSource("commandDescriptionCasesSource")
  void commandDescription(String command, String expected) {
    new Terminal().commandDescription(command);

    Terminal terminal =new Terminal();
   String input = terminal.commandDescription(command);
    assertEquals(expected, input);
  }

  @Test
  void addToDirectory() {
  }

  @Test
  void changeDirectory() {
  }

  @Test
  void homePWD() {
  }

  @Test
  void getCurrentDirectory() {
  }

}