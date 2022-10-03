import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;
import java.util.Date;

class DateTimeGroup {

  public static void main(String[] args) {

    datePrompt();
  }

  private static void datePrompt() {

//    LocalDate date = LocalDate.now();
//    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(date);
//    String text = date.format(formatter);
//    LocalDate parsedDate = LocalDate.parse(text, formatter);



    SimpleDateFormat prompt = new SimpleDateFormat( "EEE MMM d  HH:mm:ss");

    String today = prompt.format(LocalDateTime.now());

    System.out.printf("Last login: %s on ttys000 %n", today);




  }
}



