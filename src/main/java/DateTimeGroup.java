import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;
import java.util.Date;

class DateTimeGroup {

  public static void main(String[] args) {
    datePrompt();
  }

  private static void datePrompt() {

    Date date = new Date();

    SimpleDateFormat prompt = new SimpleDateFormat( "EEE MMM  d HH:mm:ss");

    String today = prompt.format(date);

    System.out.printf("Last login: %s on ttys000 %n", today);
  }
}



