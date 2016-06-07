import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

/**
 * Created by Michał on 2016-06-07.
 */
public class MeczykiTests extends BaseTest{

    @Test
    public void navigateToNews(){
        /* otwieramy przegladarkę i nawigujemy do strony meczyki.pl*/
        openMeczyki();

        /* pobieramy link z nawigacji do news'ow */
        WebElement newsLink = driver.findElement(By.xpath("//div[contains(@class,'menu')]//a[contains(@href,'/newsy')]"));

        /* klikamy na button news */
        newsLink.click();

        /* sprawdzamy tytul strony */
        assertEquals("Aktualności sportowe - Meczyki.pl", driver.getTitle());
    }
    @Test
    public void navigateToResults(){
        openMeczyki();
        WebElement resultLink = driver.findElement(By.xpath("//*[@id=\"yw0\"]/li[3]/a"));
        resultLink.click();
    }

}
