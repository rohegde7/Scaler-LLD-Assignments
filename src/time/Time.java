package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public static LocalDateTime now;

    public static String getCurrentTime() {
        return dtf.format(LocalDateTime.now());
    }
}
