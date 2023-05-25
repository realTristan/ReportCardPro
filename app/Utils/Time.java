package Utils;

import java.time.Clock;

public class Time {
    public static long getNano() {
        return Clock.systemDefaultZone().instant().getNano();
    }
}
