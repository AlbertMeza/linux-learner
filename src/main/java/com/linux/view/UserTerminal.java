package com.linux.view;


public interface UserTerminal {

  void startTerminal();

  void commandAction(String command);

  void commandDescription(String command);

  void changeDirectory(String dir);

}
