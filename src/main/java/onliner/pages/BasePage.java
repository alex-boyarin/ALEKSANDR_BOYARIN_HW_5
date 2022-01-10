package onliner.pages;

import onliner.mainPage.MainMenu;
import onliner.utils.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver webDriver = WebDriverRunner.getDriver();
    protected MainMenu mainMenu = new MainMenu();

    public abstract BasePage openPage();

}
