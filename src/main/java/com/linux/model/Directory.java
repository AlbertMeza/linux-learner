package com.linux.model;

import java.util.Arrays;
import java.util.List;

//TODO javadocs and ABC the create{}controller.Directory
public class Directory {

  private final List<String> homeDirectory;
  private final List<String> desktopDirectory;
  private final List<String> libraryDirectory;
  private final List<String> moviesDirectory;
  private final List<String> documentDirectory;
  private final List<String> publicDirectory;
  private final List<String> pictureDirectory;
  private final List<String> downloadDirectory;

  public Directory() {//ctor
    homeDirectory = createHomeDirectory();
    desktopDirectory = createDesktopDirectory();
    libraryDirectory = createLibraryDirectory();
    moviesDirectory = createMoviesDirectory();
    documentDirectory = createDocumentsDirectory();
    publicDirectory = createPublicDirectory();
    pictureDirectory = createPictureDirectory();
    downloadDirectory = createDownloadsDirectory();

  }
//getters
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

  private List<String> createHomeDirectory(){
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

  public List<String> createDesktopDirectory(){
    return Arrays.asList(
        "IDEs",
        "Jackbox Party Pack",
        "Homework"
    );
  }

  public List<String> createLibraryDirectory(){
    return Arrays.asList(
        "Head First Java",
        "Java: A Beginner's Guide",
        "Java: The Complete Reference",
        "Core Java",
        "Effective Java",
        "Design Patterns: Elements of Reusable Object-Oriented Software",
        "Head First Design Patterns"
    );
  }

  public List<String> createMoviesDirectory(){
    return Arrays.asList(
        "The Dark Knight",
        "Titanic",
        "Star Wars: Revenge of the Sith",
        "Spinal Tap",
        "Avatar",
        "Avengers: Endgame"
    );
  }

  private List<String> createDocumentsDirectory() {
    return Arrays.asList(
        "Computers aren’t magic!",
        "Head First Java",
        "THE KEYBOARD IS YOUR FRIEND",
        "Why the mouse is not your friend",
        "Top 10 reasons I hate Xfinity",
        "Tips and Tricks(Have you read it yet?)"     );
  }



  private List<String> createPublicDirectory() {
    return Arrays.asList(
        "Public speaking event",
        "Java: coffee not code",
        "From Cradle to Gradle: Teaching babies to code",
        "Reminder to give Giovanni, Albert, And Anthony a high five",
        "Proposal for Coraline: Dead Threads"     );
  }



  private List<String> createPictureDirectory(){
    return Arrays.asList(
        "Cats",
        "LinkedIn.JPEG",
        "Screenshots"     );
  }



  private List<String> createDownloadsDirectory(){
    return Arrays.asList(
        "League of Legends",
        "Spotify"     );
  }


  public static String printDirectory(LinkedList<String> list){
    StringBuilder directoryList = new StringBuilder(list.get(0) + "\n");
    for(int i = 1; i < list.size(); i++){
      directoryList.append(list.get(i)).append("\n");
    }
    return directoryList.toString();
  }


  public List<String> changeDirectory(String directory){ //TODO look into switch short hand (desktop) => createDesktopDirectory(), it's something like this
    switch(directory) {
      case "Desktop":
        return createDesktopDirectory();
      case "Pictures":
        return createPictureDirectory();
      case "Public":
        return createPublicDirectory();
      case "Documents":
        return createDocumentsDirectory();
      case "Downloads":
        return createDownloadsDirectory();
      case "Library":
        return createLibraryDirectory();
      case "Movies":
        return createMoviesDirectory();
    }
    return createHomeDirectory();
  }
}

