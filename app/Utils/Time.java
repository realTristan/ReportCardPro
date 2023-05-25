package Utils;

import java.time.Clock;

/**
 * A class for getting the current time.
 */
public class Time {
    /**
     * Returns the current time in nanoseconds.
     *
     * @return the current time in nanoseconds
     */
    public static long getNano() {
        return Clock.systemDefaultZone().instant().getNano();
    }
}
