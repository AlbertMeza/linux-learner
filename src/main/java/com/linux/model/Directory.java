package com.linux.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Holds all Directories being used in the Terminal. Each directory is implemented as a linked array list
 */
public class Directory {

  private static List<String> homeDirectory;
  private static List<String> desktopDirectory;
  private static List<String> libraryDirectory;
  private static List<String> moviesDirectory;
  private static List<String> documentDirectory;
  private static List<String> publicDirectory;
  private static List<String> pictureDirectory;
  private static List<String> downloadDirectory;

  public Directory() {
    homeDirectory = homeDirectory();
    desktopDirectory = desktopDirectory();
    libraryDirectory = libraryDirectory();
    moviesDirectory = moviesDirectory();
    documentDirectory = documentDirectory();
    publicDirectory = publicDirectory();
    pictureDirectory = pictureDirectory();
    downloadDirectory = downloadDirectory();
  }

  private List<String> homeDirectory(){
    return new LinkedList<>(Arrays.asList(
        "Pictures",
        "Desktop",
        "Public",
        "Documents",
        "Downloads",
        "Library",
        "Movies"
    ));
  }

  private List<String> desktopDirectory(){
    return new LinkedList<>(Arrays.asList(
      "IDEs",
      "Jackbox Party Pack",
      "Homework"
    ));
  }

  private List<String> libraryDirectory(){
    return new LinkedList<>(Arrays.asList(
      "Head First Java",
      "Java: A Beginner's Guide",
      "Java: The Complete Reference",
      "Core Java",
      "Effective Java",
      "Design Patterns: Elements of Reusable Object-Oriented Software",
      "Head First Design Patterns "
    ));
  }

  private List<String> moviesDirectory(){
    return new LinkedList<>(Arrays.asList(
      "Spinal Tap",
      "Avatar",
      "Avengers: Endgame",
      "Star Wars: Revenge of the Sith",
      "The Dark Knight",
      "Titanic"
    ));
  }


  private List<String> documentDirectory() {
    return new LinkedList<>(Arrays.asList(
    "Computers aren’t magic!",
    "Head First Java",
    "THE KEYBOARD IS YOUR FRIEND",
    "Why the mouse is not your friend",
    "Top 10 reasons I hate Xfinity",
    "Tips and Tricks(Have you read it yet?)"
    ));
  }

  private List<String> publicDirectory() {
    return new LinkedList<>(Arrays.asList(
    "Public speaking event",
    "Java: coffee not code",
    "From Cradle to Gradle: Teaching babies to code",
    "Reminder to give Giovanni, Albert, And Anthony a high five",
    "Proposal for Coraline: Dead Threads"
    ));
  }

  private List<String> pictureDirectory(){
    return new LinkedList<>(Arrays.asList(
    "Cats",
    "LinkedIn.JPEG",
    "Screenshots"
    ));
  }

  private List<String> downloadDirectory(){
    return new LinkedList<>(Arrays.asList(
    "League of Legends",
    "Spotify"
    ));
  }

  /**
   * Used to print all contents with the command {ls}
   * @param list A directory
   * @return A string representation of content within the directory
   */
  String printDirectory(List<String> list){
    StringBuilder directoryList = new StringBuilder(list.get(0) + "\n");
    for(int i = 1; i < list.size(); i++){
      if(i == list.size()-1) {
        directoryList.append(list.get(i));
      }
      else {
        directoryList.append(list.get(i)).append("\n");
      }
    }
    return directoryList.toString();
  }

  /**
   * Used to change directory with the command {cd [directory name]},
   * option to use {cd ~} to return to home directory
   * @param directory the second command after {cd}
   * @return a list to store as the present working directory
   */
  List<String> switchDirectory(String directory){
    List<String> changeTo;
    switch(directory) {
      case "Desktop":
        changeTo = getDesktopDirectory();
        break;
      case "Pictures":
        changeTo = getPictureDirectory();
        break;
      case "Public":
        changeTo = getPublicDirectory();
        break;
      case "Documents":
        changeTo = getDocumentDirectory();
        break;
      case "Downloads":
        changeTo = getDownloadDirectory();
        break;
      case "Library":
        changeTo = getLibraryDirectory();
        break;
      case "Movies":
        changeTo = getMoviesDirectory();
        break;
      default:
        changeTo = getHomeDirectory();
    }
    return changeTo;
  }
  List<String> getHomeDirectory() {
    return homeDirectory;
  }

  List<String> getDesktopDirectory() {
    return desktopDirectory;
  }

  List<String> getLibraryDirectory() {
    return libraryDirectory;
  }

  List<String> getMoviesDirectory() {
    return moviesDirectory;
  }

  List<String> getDocumentDirectory() {
    return documentDirectory;
  }

  List<String> getPublicDirectory() {
    return publicDirectory;
  }

  List<String> getPictureDirectory() {
    return pictureDirectory;
  }

   List<String> getDownloadDirectory() {
    return downloadDirectory;
  }
}

