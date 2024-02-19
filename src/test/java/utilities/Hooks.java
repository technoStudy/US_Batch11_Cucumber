package utilities;

import io.cucumber.java.Before;

public class Hooks {
/*
Cucumber has a feature that allows it automaticaly detect and run the
methods annotated with @Before and @After they are running before adn after
each scenario.
 */
    // we will create here to use different browser
    // if you wish you can create driver methods in this class
    // we should import from the io.cucumber.java
    @Before
    public void setUp(){
        // Set the browser type for the current thread
        ThreadSafeDriver.threadBrowserName.set("browser");
    }

}
