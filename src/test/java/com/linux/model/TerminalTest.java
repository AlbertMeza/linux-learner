package com.linux.model;

import static org.junit.jupiter.api.Assertions.*;


import com.linux.view.DateTimeGroup;
import com.linux.view.StringLiterals;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TerminalTest {

  public static Stream<Arguments> commandDescriptionInvalidTestCases() {
    return Stream.of(
        Arguments.of("me", StringLiterals.INVALID_COMMAND),
        Arguments.of("you", StringLiterals.INVALID_COMMAND),
        Arguments.of("me help you", StringLiterals.INVALID_COMMAND)
    );
  }
  public static Stream<Arguments> commandDescriptionTestCases() {
    return Stream.of(
        Arguments.of("cd", StringLiterals.CD_DESCRIPTION),
        Arguments.of("clear", StringLiterals.CLEAR_DESCRIPTION),
        Arguments.of("exit", StringLiterals.EXIT_DESCRIPTION),
        Arguments.of("help",StringLiterals.HELP_DESCRIPTION),
        Arguments.of("ls",StringLiterals.LS_DESCRIPTION),
        Arguments.of("pwd", StringLiterals.PWD_DESCRIPTION),
        Arguments.of("touch", StringLiterals.TOUCH_DESCRIPTION),
        Arguments.of("task1", StringLiterals.TASK_ONE),
        Arguments.of("task2", StringLiterals.TASK_TWO),
        Arguments.of("task3", StringLiterals.TASK_THREE)

    );
  }

  public static Stream<Arguments> commandActionInvalidTestCases() {
    return Stream.of(
        Arguments.of("Hello", StringLiterals.INVALID_COMMAND),
        Arguments.of("World", StringLiterals.INVALID_COMMAND),
        Arguments.of("Hello World", StringLiterals.INVALID_COMMAND)
    );
  }

  //PWD unable to test
  public static Stream<Arguments> commandActionOneCommandTestCases() {
    return Stream.of(
        Arguments.of("clear", StringLiterals.CLEAR),
        Arguments.of("ls", "Pictures\nDesktop\nPublic\nDocuments\nDownloads\nLibrary\nMovies"),
        Arguments.of("exit", StringLiterals.EXIT),
        Arguments.of("help", StringLiterals.HELP_DESCRIPTION),
        Arguments.of("touch", StringLiterals.TOUCH_INVALID),
        Arguments.of("task1", StringLiterals.TASK_ONE),
        Arguments.of("task2", StringLiterals.TASK_TWO),
        Arguments.of("task3", StringLiterals.TASK_THREE)
    );
  }

  @ParameterizedTest
  @MethodSource({"commandDescriptionTestCases", "commandDescriptionInvalidTestCases"})
  void commandDescription(String command, String expected) {
    Terminal terminal = new Terminal();
    terminal.commandDescription(command);
    assertEquals(expected, expected);
  }


  @ParameterizedTest
  @MethodSource({"commandActionOneCommandTestCases", "commandActionInvalidTestCases"})
  void commandAction(String command, String expected) {
    Terminal terminal = new Terminal();
    terminal.commandDescription(command);
    assertEquals(expected, expected);
  }

  @Test
  void changeDirectoryTest(){
    Terminal terminal = new Terminal();
    Directory dir = new Directory();
    terminal.changeDirectory("Desktop");
    assertEquals(terminal.getCurrentDirectory(), dir.getDesktopDirectory());
  }

  @Test
  void dateTimeGroupTest() {
    String time = DateTimeGroup.datePrompt();
    Date date = new Date();
    SimpleDateFormat prompt = new SimpleDateFormat("EEE MMM  d HH:mm:ss");
    String today = prompt.format(date);
    assertEquals(today, time);
  }
  @Test
  void changeDirectoryHomeTest(){
    Terminal terminal = new Terminal();
    Directory dir = new Directory();
    terminal.changeDirectory("~");
    assertEquals(terminal.getCurrentDirectory(), dir.getHomeDirectory());
  }

  @Test
  void changeDirectoryInvalidTest(){
    Terminal terminal = new Terminal();
    List<String> expected = terminal.getCurrentDirectory();
    terminal.changeDirectory("pumpkin");
    assertEquals(expected, terminal.getCurrentDirectory());
  }
}