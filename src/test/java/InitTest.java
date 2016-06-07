/**
 * Created by Michał on 2016-06-07.
 */

import org.junit.Test;

public class InitTest extends BaseTest {




    @Test
    public void showMessage(){
        System.out.println("Hello World!");
    }

    @Test
    public void openBrowser(){
        driver.get("http://google.com");
    }



}
