package October18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class WebTables3 {


    public static void main(String[] args) {


        System.out.println();

        LocalDate date = LocalDate.now();

        System.out.println(date.toString());

        System.out.println(date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

//        LocalDate, LocalDateTime, ZonedDateTime

    }
}
