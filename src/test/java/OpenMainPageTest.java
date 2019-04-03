import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import static steps.OpenPage.openPage;
import pages.MainPage;
import static utils.DriverSingleton.closeDriver;
import static utils.DriverSingleton.getDriver;

public class OpenMainPageTest {
    @Test
    public void openMainPageTest() {
        MainPage mainPage = new MainPage(getDriver());
        openPage(mainPage);
        new WebDriverWait(getDriver(), 30).until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//a[contains(.,'Contact Sales')]")));
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://cloud.google.com/", "Error with opening MainPage");
    }

    @AfterClass
    public void afterClass() {
        closeDriver();
    }
}
