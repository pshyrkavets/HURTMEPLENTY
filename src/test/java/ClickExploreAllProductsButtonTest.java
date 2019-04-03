import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.MainPage;
import static steps.ClickButton.clickButton;
import static steps.OpenPage.openPage;
import java.time.Duration;
import static utils.DriverSingleton.closeDriver;
import static utils.DriverSingleton.getDriver;

public class ClickExploreAllProductsButtonTest {
    @Test
    public void clickExploreAllProductsButtonTest() {
        MainPage mainPage = new MainPage(getDriver());
        openPage(mainPage);
        Wait<WebDriver> waitExploreAllProductsButton = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement productsPage = waitExploreAllProductsButton.until(driver1 -> driver1
                .findElement(By.xpath("//a[contains(@track-name,'exploreProducts')]")));
        clickButton(mainPage.getExploreAllProductsButton());
        Wait<WebDriver> waitSeePricing = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement seePricingButton = waitSeePricing.until(driver1 -> driver1
                .findElement(By.xpath("//a[contains(@track-name,'seePricing')]")));
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl,
                "https://cloud.google.com/products/", "Error with opening ProductsPage");
    }

    @AfterClass
    public void afterClass() {
        closeDriver();
    }
}
