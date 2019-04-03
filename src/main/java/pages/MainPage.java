package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
    private static final String PAGE_URL = "https://cloud.google.com/";

    @FindBy(xpath = "//a[contains(@track-name,'exploreProducts')]")
    private WebElement exploreAllProductsButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public String getUrl() {
        return PAGE_URL;
    }
    public WebElement getExploreAllProductsButton() { return exploreAllProductsButton; }
}
