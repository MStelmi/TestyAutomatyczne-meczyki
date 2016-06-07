import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

/**
 * Created by Michał on 2016-06-07.
 */
public abstract class BaseTest {
    protected static WebDriver driver;

/* atrybut BeforeClass uruchamia się przed testami */
    @BeforeClass
    public static void setUp(){
        /* ustawianie instancji WebDriver'a*/
        driver = DriverProvider.getDriver();

    }
}
