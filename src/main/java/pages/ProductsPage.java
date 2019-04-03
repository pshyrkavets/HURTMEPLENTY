package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static utils.DriverSingleton.getDriver;

public class ProductsPage extends AbstractPage {
    private static final String PRODUCTS_PAGE_URL = "https://cloud.google.com/products/";
    private static WebElement seePricingButton = getDriver()
            .findElement(By.xpath("//a[contains(@track-name,'seePricing')]"));

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public String getUrl() {
        return PRODUCTS_PAGE_URL;
    }
    public WebElement getSeePricingButton() { return seePricingButton; }
}
