package com.linux;

import com.linux.model.Terminal;

/**
 * Implements entry point for <strong>Linux Learner</strong>, a terminal built from Java!
 */
public class TerminalMain {

  private TerminalMain(){
    //Prevent creation (and documentation) of a default constructor
  }
  /**
   * Acts as an entry-point for the application. Top-level
   * program execution is delegated to {@link Terminal}.
   *
   * @param args
   */
  public static void main(String[] args) {
      new Terminal().startTerminal();
  }
}
