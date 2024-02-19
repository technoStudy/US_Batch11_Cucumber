package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReusableMethods {

    protected static final Logger log = LogManager.getLogger();
    public static void wait (int seconds) {
        try {
            Thread.sleep(1000L * seconds);
        } catch (InterruptedException e) {
            log.warn("InterruptedException in Thread.sleep(). Message: " + e.getMessage());
        }
    }
}
