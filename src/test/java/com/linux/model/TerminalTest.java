package com.linux.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TerminalTest {

  public static Stream<Arguments> commandActionTestCases() {
    return Stream.of(
        Arguments.of("cd", "Change Directory (cd): Change the current directory user is in to requested directory\n Note: user may not have permissions to access all Directories"),
        Arguments.of("clear","Clear: clears the screen, does not remove any data currently or previously used " ),
        Arguments.of("exit","Exit: Disconnects ssh user and Exits the terminal" ),
        Arguments.of("help","Help: Gives a user an explanation of the commands"),
        Arguments.of("ls","List Directory Contents (ls):  List information about the FILEs (the current directory by default).\n Sort entries alphabetically if no order specified" ),
        Arguments.of("pwd", "Print Working Directory (pwd): Print the full filename of the current working directory"),
        Arguments.of("touch", "Update the access and modification times of each FILE to the current time \n A FILE argument that does not exist is created empty\n")
    );
  }


  @ParameterizedTest
  @MethodSource("commandActionTestCases")
  void commandAction(String command, String expected) {
    Terminal terminal = new Terminal();
    String input = terminal.commandDescription(command);
    assertEquals(expected, input);
  }

  @Test
  void commandDescription() {
  }
}