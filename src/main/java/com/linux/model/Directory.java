package com.linux.model;

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
    return List.of(
        "Pictures",
        "Desktop",
        "Public",
        "Documents",
        "Downloads",
        "Library",
        "Movies"
    );
  }

  private List<String> desktopDirectory(){
    return List.of(
      "IDEs",
      "Jackbox Party Pack",
      "Homework"
    );
  }

  private List<String> libraryDirectory(){
    return List.of(
      "Head First Java",
      "Java: A Beginner's Guide",
      "Java: The Complete Reference",
      "Core Java",
      "Effective Java",
      "Design Patterns: Elements of Reusable Object-Oriented Software",
      "Head First Design Patterns "
    );
  }

  private List<String> moviesDirectory(){
    return List.of(
      "Spinal Tap",
      "Avatar",
      "Avengers: Endgame",
      "Star Wars: Revenge of the Sith",
      "The Dark Knight",
      "Titanic"
    );
  }


  private List<String> documentDirectory() {
    return List.of(
    "Computers aren’t magic!",
    "Head First Java",
    "THE KEYBOARD IS YOUR FRIEND",
    "Why the mouse is not your friend",
    "Top 10 reasons I hate Xfinity",
    "Tips and Tricks(Have you read it yet?)"
    );
  }

  private List<String> publicDirectory() {
    return List.of(
    "Public speaking event",
    "Java: coffee not code",
    "From Cradle to Gradle: Teaching babies to code",
    "Reminder to give Giovanni, Albert, And Anthony a high five",
    "Proposal for Coraline: Dead Threads"
    );
  }

  private List<String> pictureDirectory(){
    return List.of(
    "Cats",
    "LinkedIn.JPEG",
    "Screenshots"
    );
  }

  private List<String> downloadDirectory(){
    return List.of(
    "League of Legends",
    "Spotify"
    );
  }

  public String printDirectory(List<String> list){
    StringBuilder directoryList = new StringBuilder(list.get(0) + "\n");
    for(int i = 1; i < list.size(); i++){
      directoryList.append(list.get(i)).append("\n");
    }
    return directoryList.toString();
  }


  public List<String> switchDirectory(String directory){ //TODO look into switch short hand (desktop) => createDesktopDirectory(), it's something like this
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
  public List<String> getHomeDirectory() {
    return homeDirectory;
  }

  public List<String> getDesktopDirectory() {
    return desktopDirectory;
  }

  public List<String> getLibraryDirectory() {
    return libraryDirectory;
  }

  public List<String> getMoviesDirectory() {
    return moviesDirectory;
  }

  public List<String> getDocumentDirectory() {
    return documentDirectory;
  }

  public List<String> getPublicDirectory() {
    return publicDirectory;
  }

  public List<String> getPictureDirectory() {
    return pictureDirectory;
  }

  public List<String> getDownloadDirectory() {
    return downloadDirectory;
  }
}

