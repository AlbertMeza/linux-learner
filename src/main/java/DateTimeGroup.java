import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;
import java.util.Date;

public class DateTimeGroup {

  public static void datePrompt() {

    Date date = new Date();
    SimpleDateFormat prompt = new SimpleDateFormat("EEE MMM  d HH:mm:ss");
    String today = prompt.format(date);
    System.out.printf("Last login: %s on ttys000 %n", today);
  }
}
