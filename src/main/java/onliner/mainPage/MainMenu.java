package onliner.mainPage;

import onliner.enums.TopMenuMainPage;
import onliner.utils.WebDriverRunner;
import org.openqa.selenium.By;

public class MainMenu {
    private static final String ITEM_PATTERN = "//span[contains(@class, 'navigation__text') and contains(text(), '%s')]";

    public void clickOnItem(TopMenuMainPage item) {
        WebDriverRunner.getDriver()
                .findElement(By.xpath(String.format(ITEM_PATTERN, item.getValue())))
                .click();
    }
}
