package steps;

import pages.AbstractPage;
import utils.DriverSingleton;

public class OpenPage {
    public static void openPage(AbstractPage page) {
        DriverSingleton.getDriver().get(page.getUrl());
    }
}
