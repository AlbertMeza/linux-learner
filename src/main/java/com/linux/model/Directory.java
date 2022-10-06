package com.linux.model;

import java.util.Arrays;
import java.util.List;

//TODO javadocs and ABC the create{}controller.Directory
public class Directory {

  private static List<String> homeDirectory;
  private static List<String> desktopDirectory;
  private static List<String> libraryDirectory;
  private static List<String> moviesDirectory;
  private static List<String> documentDirectory;
  private static List<String> publicDirectory;
  private static List<String> pictureDirectory;
  private static List<String> downloadDirectory;

  public Directory() {//ctor
    homeDirectory =homeDirectory();
    desktopDirectory = desktopDirectory();
    libraryDirectory = libraryDirectory();
    moviesDirectory = moviesDirectory();
    documentDirectory = documentDirectory();
    publicDirectory = publicDirectory();
    pictureDirectory = pictureDirectory();
    downloadDirectory = downloadDirectory();
  }


  public static List<String> getHomeDirectory() {
    return homeDirectory;
  }

  public static List<String> getDesktopDirectory() {
    return desktopDirectory;
  }

  public static List<String> getLibraryDirectory() {
    return libraryDirectory;
  }

  public static List<String> getMoviesDirectory() {
    return moviesDirectory;
  }

  public static List<String> getDocumentDirectory() {
    return documentDirectory;
  }

  public static List<String> getPublicDirectory() {
    return publicDirectory;
  }

  public static List<String> getPictureDirectory() {
    return pictureDirectory;
  }

  public static List<String> getDownloadDirectory() {
    return downloadDirectory;
  }

  static List<String> homeDirectory(){
    return Arrays.asList(
        "Pictures",
        "Desktop",
        "Public",
        "Documents",
        "Downloads",
        "Library",
        "Movies"
    );
  }

  static List<String> desktopDirectory(){
    return Arrays.asList(
      "IDEs",
      "Jackbox Party Pack",
      "Homework"
    );
  }

  static List<String> libraryDirectory(){
    return Arrays.asList(
      "Head First Java",
      "Java: A Beginner's Guide",
      "Java: The Complete Reference",
      "Core Java",
      "Effective Java",
      "Design Patterns: Elements of Reusable Object-Oriented Software",
      "Head First Design Patterns "
    );
  }

  static List<String> moviesDirectory(){
    return Arrays.asList(
      "Spinal Tap",
      "Avatar",
      "Avengers: Endgame",
      "Star Wars: Revenge of the Sith",
      "The Dark Knight",
      "Titanic"
    );
  }


  static List<String> documentDirectory() {
    return Arrays.asList(
    "Computers aren’t magic!",
    "Head First Java",
    "THE KEYBOARD IS YOUR FRIEND",
    "Why the mouse is not your friend",
    "Top 10 reasons I hate Xfinity",
    "Tips and Tricks(Have you read it yet?)"
    );
  }

  static List<String> publicDirectory() {
    return Arrays.asList(
    "Public speaking event",
    "Java: coffee not code",
    "From Cradle to Gradle: Teaching babies to code",
    "Reminder to give Giovanni, Albert, And Anthony a high five",
    "Proposal for Coraline: Dead Threads"
    );
  }

  static List<String> pictureDirectory(){
    return Arrays.asList(
    "Cats",
    "LinkedIn.JPEG",
    "Screenshots"
    );
  }

  static List<String> downloadDirectory(){
    return Arrays.asList(
    "League of Legends",
    "Spotify"
    );
  }

  public static String printDirectory(List<String> list){
    StringBuilder directoryList = new StringBuilder(list.get(0) + "\n");
    for(int i = 1; i < list.size(); i++){
      directoryList.append(list.get(i)).append("\n");
    }
    return directoryList.toString();
  }


  static List<String> changeDirectory(String directory){ //TODO look into switch short hand (desktop) => createDesktopDirectory(), it's something like this
    switch(directory) {
      case "Desktop":
        return getDesktopDirectory();
      case "Pictures":
        return getPictureDirectory();
      case "Public":
        return getPublicDirectory();
      case "Documents":
        return getDocumentDirectory();
      case "Downloads":
        return getDownloadDirectory();
      case "Library":
        return getLibraryDirectory();
      case "Movies":
        return getMoviesDirectory();
    }
    return getHomeDirectory();
  }
}

