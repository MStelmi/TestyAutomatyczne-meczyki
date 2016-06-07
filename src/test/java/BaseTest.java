import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Michał on 2016-06-07.
 */
public abstract class BaseTest {
    protected static WebDriver driver;
    protected final String MECZYKI_URL = "http://meczyki.pl";
    protected static Actions actions;

/* atrybut BeforeClass uruchamia się przed testami */
    @BeforeClass
    public static void setUp(){
        /* ustawianie instancji WebDriver'a*/
        driver = DriverProvider.getDriver();
        if(actions == null){
            actions = new Actions(driver);
        }

    }
    protected void openMeczyki(){
        /* otwieramy stronę meczyki.pl */
        driver.get(MECZYKI_URL);
    }
}
