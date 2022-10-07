package com.linux.view;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * All date time group related support
 */
public class DateTimeGroup {

  /**
   * Used to log user login time
   * @return A string presentation of the time of which the user gets on the Terminal
   */
  public static String datePrompt() {
    Date date = new Date();
    SimpleDateFormat prompt = new SimpleDateFormat("EEE MMM  d HH:mm:ss");
    return "Last login: %s on ttys000 " + prompt.format(date);
  }
}
