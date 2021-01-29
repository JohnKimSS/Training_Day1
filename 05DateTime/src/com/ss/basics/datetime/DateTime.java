package com.ss.basics.datetime;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * @author John Kim
 */
public class DateTime {

    public static void main(String[] args) {
    // Q.1: Storing my birthday in LocalDateTime class
        LocalDateTime birthday = LocalDateTime.of(1991, Month.MARCH, 26, 10, 10, 30);
        System.out.println("My B-Day is "+birthday);
    // Q.2 Given random date, find date of the previous Thursday
        LocalDate someDay = randomDate();
        System.out.println("Previous Thursday of "+someDay+" is on "+previousThursday(someDay));
    }

    public static LocalDate randomDate() { // Method for Q.2
        return LocalDate.now().minus(Period.ofDays((int) Math.floor(Math.random() * 365)));
    }

    public static LocalDate previousThursday(LocalDate someDay) { //Method for Q.2
        return someDay.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
    }

}
