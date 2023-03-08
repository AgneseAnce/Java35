package basics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeExamples {
    public static void main(String[] args) {

        // LocalTime - create a local time object, with .now take the local time of computer
        LocalTime currentTime = LocalTime.now();
        System.out.println("Now it is " + currentTime);

        // To get rid of milliseconds
        currentTime = LocalTime.now().withNano(0);
        System.out.println("Current time: " + currentTime);

        // Use / instead of : in time
        System.out.println(currentTime.getHour() + "/" + currentTime.getMinute() + "/" + currentTime.getSecond());

        LocalTime currentTime1 = LocalTime.now().withNano(0);
        currentTime1 = currentTime1.plusMinutes(15);
        System.out.println("Break until " + currentTime1);

        System.out.println("Now it is " + currentTime.getHour() + " o'clock");

        // LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today is: " + currentDate);
        System.out.println("Year: " + currentDate.getYear());
        System.out.println("Day of the week: " + currentDate.getDayOfWeek());
        System.out.println("Day of the year: " + currentDate.getDayOfYear());


        // To return a date in the past rather than now
        LocalDate startOfCovid = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid-19 started on " + startOfCovid);


    }
}
