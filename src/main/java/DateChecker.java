import java.util.Arrays;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    private final DateChecker.Month[] monthsWith31Days = {Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY, Month.AUGUST, Month.OCTOBER, Month.DECEMBER};
    // months with 31 days - January, March, May, July, August, October, and December
    public boolean has31Days(Month month) {
        return Arrays.asList(monthsWith31Days).contains(month);
    }

    


}
