/*import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.MainPage;
import steps.ClickButton;
import steps.OpenPage;
import java.time.Duration;
import static utils.DriverSingleton.closeDriver;
import static utils.DriverSingleton.getDriver;

public class ClickSeePricingButtonTest {
    @Test
    public void clickExploreAllProductsButtonTest() {
        MainPage mainPage = new MainPage();
        new OpenPage().openPage(mainPage);
        Wait<WebDriver> waitExploreAllProducts = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement productsPage = waitExploreAllProducts.until(driver1 -> driver1
                .findElement(By.xpath("//a[contains(@track-name,'exploreProducts')]")));
        new ClickButton().clickButton(mainPage.getExploreAllProductsButton());
        Wait<WebDriver> waitSeePricing = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement seePricing = waitSeePricing.until(driver1 -> driver1
                .findElement(By.xpath("//a[contains(@track-name,'seePricing')]")));
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl,
                "https://cloud.google.com/products/", "Error with opening ProductsPage");
    }

    @AfterClass
    public void afterClass() {
        closeDriver();
    }
}*/
