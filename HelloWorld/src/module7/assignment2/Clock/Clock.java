package module7.assignment2.Clock;

/**
 * Clock data type. Write a data type Clock.java that
 * represents time on a 24-hour clock, such as 00:00, 13:30, or
 * 23:59. Time is measured in hours (00–23) and minutes (00–59). 
 * To do so, implement the following public API:
 * 
 * @author Siva Sankar
 */

public class Clock {
    // Creates a clock whose initial time is h hrs and m min.
    /**
     * The parameterised constructor will instatiates the object with the values of
     * the parameters h and m to the respective hrs nad min.
     * @param h
     * @param m
     */
    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;
    private int hours;     // the hour   (between 0 and 23)
    private int minutes;   // the minute (between 0 and 59)


    public Clock(int h, int m) {
        hours = h;
        minutes = m;
        validateTime(hours, minutes);
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.

    public Clock(String s) {

        if (!s.matches("[0-9][0-9]:[0-9][0-9]")) {
            throw new IllegalArgumentException("invalid time: " + s);
        }
        hours   = Integer.parseInt(s.substring(0, 2));
        minutes = Integer.parseInt(s.substring(3, 5));
        validateTime(hours, minutes);

    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (this.hours < that.hours) return true;
        if (this.hours > that.hours) return false;
        return this.minutes < that.minutes;
    }

  /*  private void check() {
        if (h < 0 || h >= HOURS_PER_DAY) {
            throw new IllegalArgumentException("hours is invalid: " + h);
        }
        if (m < 0 || m >= MINUTES_PER_HOUR) {
            throw new IllegalArgumentException("minutes is invalid: " + m);
        }
    }*/

    private static void validateTime(int h, int m) {
        if (h < 0 || h >= HOURS_PER_DAY) {
            throw new IllegalArgumentException("hours is invalid: " + h);
        }
        if (m < 0 || m >= MINUTES_PER_HOUR) {
            throw new IllegalArgumentException("minutes is invalid: " + m);
        }
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        minutes++;
        if (minutes == MINUTES_PER_HOUR) {
            minutes = 0;
            hours++;
        }
        if (hours == HOURS_PER_DAY) {
            hours = 0;
        }
    }

    // Adds Δ min to the time on this clock.
    public void toc(int delta) {
        
    }

    // Test client (see below).
    public static void main(String[] args) {
        Clock clock = new Clock("13:01");
        clock.toc(660);
        System.out.println(clock);
    }
}