package com.linux.model;

import java.util.Arrays;
import java.util.LinkedList;
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


  public List<String> createDocumentsDirectory() {
    LinkedList<String> documents = new LinkedList<>();
    documents.add("Computers aren’t magic!");
    documents.add("Head First Java");
    documents.add("THE KEYBOARD IS YOUR FRIEND");
    documents.add("Why the mouse is not your friend");
    documents.add("Top 10 reasons I hate Xfinity");
    documents.add("Tips and Tricks(Have you read it yet?)");

    return documents;
  }

  public List<String> createPublicDirectory() {
    LinkedList<String> publix = new LinkedList<>();//publix because public is a keyword
    publix.add("Public speaking event");
    publix.add("Java: coffee not code");
    publix.add("From Cradle to Gradle: Teaching babies to code");
    publix.add("Reminder to give Giovanni, Albert, And Anthony a high five");
    publix.add("Proposal for Coraline: Dead Threads");

    return publix;
  }

  public List<String> createPictureDirectory(){
    LinkedList<String> picture = new LinkedList<>();
    picture.add("Cats");
    picture.add("LinkedIn.JPEG");
    picture.add("Screenshots");

    return picture;
  }

  public List<String> createDownloadsDirectory(){
    LinkedList<String> downloads = new LinkedList<>();
    downloads.add("League of Legends");
    downloads.add("Spotify");

    return downloads;
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

