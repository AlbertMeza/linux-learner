package com.linux.model;

import static org.junit.jupiter.api.Assertions.*;

import com.linux.TerminalMain;
import com.linux.view.DateTimeGroup;
import com.linux.view.StringLiterals;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TerminalTest {

  public static Stream<Arguments> commandDescriptionTestCases() {
    return Stream.of(
        Arguments.of("cd", StringLiterals.CD_DESCRIPTION),
        Arguments.of("clear", StringLiterals.CLEAR_DESCRIPTION),
        Arguments.of("exit", StringLiterals.EXIT_DESCRIPTION),
        Arguments.of("help", StringLiterals.HELP_DESCRIPTION),
        Arguments.of("ls", StringLiterals.LS_DESCRIPTION),
        Arguments.of("pwd", StringLiterals.PWD_DESCRIPTION),
        Arguments.of("touch", StringLiterals.TOUCH_DESCRIPTION)
    );
  }


  @ParameterizedTest
  @MethodSource("commandDescriptionTestCases")
  void commandDescription(String command, String expected) {
    Terminal terminal = new Terminal();
    //String input = terminal.commandDescription(command);
    assertEquals(expected, command);
  }

  @Test
  void dateTimeGroupTest() {
    Terminal terminal = new Terminal();
    //String time = DateTimeGroup.datePrompt();

    Date date = new Date();
    SimpleDateFormat prompt = new SimpleDateFormat("EEE MMM  d HH:mm:ss");
    String today = prompt.format(date);

    assertEquals(today, prompt);
  }


}

