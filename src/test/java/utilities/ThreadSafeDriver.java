package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Locale;

public class ThreadSafeDriver {

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();
    // ThreadLocal<WebDriver> is like giving each person their own personal notebook to write in.
    // means we are creating a special type of notebook holder (ThreadLocal) for web browsers
    // Each thread (think of a thread like a separate worker doing a job) gets its own notebook (web browser),
    // so they don't mix up or interfere with each other's work when running tests at the same time.

    public static ThreadLocal<String> threadBrowserName=ThreadLocal.withInitial(() -> "chrome"); // default to chrome

    public static WebDriver getDriver() {
        Locale.setDefault(new Locale("EN"));//This sets the default locale for your Java Virtual Machine (JVM) to English.
        System.setProperty("user.language", "EN"); //This sets the user.language system property to "EN",
        // which tells the JVM to use English as the default language for this running instance.

        if (threadDriver.get()==null) {
            switch (threadBrowserName.get()){
                case "firefox":
                    threadDriver.set(new FirefoxDriver());
                    break;
                case "safari":
                    threadDriver.set(new SafariDriver());
                    break;
                case "edge":
                    threadDriver.set(new EdgeDriver());
                    break;
                default :
                    if (isRunningOnJenkins()) {
                        FirefoxOptions options = new FirefoxOptions();
                        options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--disable-gpu", "--window-size=1400,2400");
                        threadDriver.set(new FirefoxDriver(options));
                    }
                    else {
                        threadDriver.set(new ChromeDriver());
                    }
        }
        }

        threadDriver.get().manage().window().maximize();
        threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        return threadDriver.get();
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        if (threadDriver.get()!=null) {
           threadDriver.get().quit();

           WebDriver driver=threadDriver.get();
           driver=null;  // null a eşitle

           threadDriver.set(driver); // kendisine null olarak ver, bu hatta bir dolu driver yok
        }
    }

    public static boolean isRunningOnJenkins() {
        String jenkinsHome = System.getenv("JENKINS_HOME");
        return jenkinsHome != null && !jenkinsHome.isEmpty();
    }

}
