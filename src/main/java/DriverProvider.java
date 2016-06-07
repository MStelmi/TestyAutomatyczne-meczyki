import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Michał on 2016-06-07.
 */

// klasa mająca na celu dostarczenie instancji webdriver'a

public class DriverProvider {

    private static WebDriver driver;


    public static WebDriver getDriver(){


        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
