package com.linux.model;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TODO javadocs and ABC the create{}controller.Directory
public class Directory {

  private final List<String> homeDirectory;

  public Directory() {
    homeDirectory = createHomeDirectory();
  }

  public List<String> getHomeDirectory() {
    return homeDirectory;
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

  public static LinkedList<String> createDesktopDirectory(){
    LinkedList<String> desktop = new LinkedList<>();
    desktop.add("IDEs");
    desktop.add("Jackbox Party Pack");
    desktop.add("Homework");

    return desktop;
  }

  public static LinkedList<String> createLibraryDirectory(){
    LinkedList<String> library = new LinkedList<>();
    library.add("Head First Java");
    library.add("Java: A Beginner's Guide");
    library.add("Java: The Complete Reference");
    library.add("Core Java");
    library.add("Effective Java");
    library.add("Design Patterns: Elements of Reusable Object-Oriented Software");
    library.add("Head First Design Patterns ");

    return library;
  }

  public static LinkedList<String> createMoviesDirectory(){
    LinkedList<String> movies = new LinkedList<>();
    movies.add("Spinal Tap");
    movies.add("Avatar");
    movies.add("Avengers: Endgame");
    movies.add("Star Wars: Revenge of the Sith");
    movies.add("Titanic");
    movies.add("The Dark Knight");

    return movies;
  }


  public static LinkedList<String> createDocumentsDirectory() {
    LinkedList<String> documents = new LinkedList<>();
    documents.add("Computers aren’t magic!");
    documents.add("Head First Java");
    documents.add("THE KEYBOARD IS YOUR FRIEND");
    documents.add("Why the mouse is not your friend");
    documents.add("Top 10 reasons I hate Xfinity");
    documents.add("Tips and Tricks(Have you read it yet?)");

    return documents;
  }

  public static LinkedList<String> createPublicDirectory() {
    LinkedList<String> publix = new LinkedList<>();//publix because public is a keyword
    publix.add("Public speaking event");
    publix.add("Java: coffee not code");
    publix.add("From Cradle to Gradle: Teaching babies to code");
    publix.add("Reminder to give Giovanni, Albert, And Anthony a high five");
    publix.add("Proposal for Coraline: Dead Threads");

    return publix;
  }

  public static LinkedList<String> createPictureDirectory(){
    LinkedList<String> picture = new LinkedList<>();
    picture.add("Cats");
    picture.add("LinkedIn.JPEG");
    picture.add("Screenshots");

    return picture;
  }

  public static LinkedList<String> createDownloadsDirectory(){
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


  public static LinkedList<String> changeDirectory(String directory){ //TODO look into switch short hand (desktop) => createDesktopDirectory(), it's something like this
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

