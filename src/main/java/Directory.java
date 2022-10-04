import java.util.LinkedList;
import org.w3c.dom.Node;

public class Directory {

  LinkedList<String> currentDirectory = createHomeDirectory();

  public static LinkedList<String> createHomeDirectory(){
    LinkedList<String> home = new LinkedList<>();
    home.add("Pictures");
    home.add("Desktop"); //complete
    home.add("Public");
    home.add("Documents");
    home.add("Downloads");
    home.add("Library");
    home.add("Movies");

    return home;
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
//      case "Desktop":
//        return createDesktopDirectory();
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
