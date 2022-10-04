import java.util.LinkedList;
import org.w3c.dom.Node;

public class Directory {

  LinkedList<String> currentDirectory = createHomeDirectory();

  public static LinkedList<String> createHomeDirectory(){
    LinkedList<String> home = new LinkedList<>();
    home.add("Pictures");//complete
    home.add("Desktop"); //complete
    home.add("Public"); //complete
    home.add("Documents");//complete
    home.add("Downloads"); //complete
    home.add("Library"); //complete
    home.add("Movies"); //complete

    return home;
  }

  public static LinkedList<String> createDesktopDirectory(){
    LinkedList<String> desktop = new LinkedList<>();
    desktop.add("IDEs");
    desktop.add("Jackbox Party Pack");
    desktop.add("Homework");

    return desktop;
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

  public static String printDirectory(LinkedList<String> list){
    String directoryList = list.get(0) + " ";
    for(int i = 1; i < list.size(); i++){
      directoryList += list.get(i) + " ";
    }
    return directoryList;
  }

  public LinkedList<String> getCurrentDirectory() {
    return currentDirectory;
  }

  public void hasDirectory(String directory){
    if (currentDirectory.contains(directory)){
      changeDirectory(directory);
    }
    else {
      System.out.println();
    }
  }

  public LinkedList<String> changeDirectory(String directory){
    switch(directory) {
      case "Desktop":
        return createDesktopDirectory();
//      case "Pictures":
//        return createPictureDirectory();
//      case "Public":
//        return createPublicDirectory();
//      case "Documents":
//        return createDocumentsDirectory();
//      case "Downloads":
//        return createDownloadsDirectory();
//      case "Library":
//        return createLibraryDirectory();
//      case "Movies":
//        return createMoviesDirectory();
    }
    return getCurrentDirectory();
  }
}


 // Pictures Desktop Public Documents Downloads Library Movies
