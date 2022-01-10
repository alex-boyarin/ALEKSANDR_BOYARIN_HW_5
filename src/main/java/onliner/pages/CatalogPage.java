package onliner.pages;

import onliner.enums.CatalogCategory;
import onliner.enums.TopMenuMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogPage extends BasePage {
    private final By ELEMENT_CATALOG = By.xpath("//li[@class='catalog-navigation-classifier__item ']");
    private List<WebElement> elementsCatalog;

    public CatalogPage() {
    }

    @Override
    public CatalogPage openPage() {
        webDriver.manage().window().maximize();
        webDriver.get("https://onliner.by");
        return this;
    }

    public CatalogPage openCatalogPortal() {
        mainMenu.clickOnItem(TopMenuMainPage.CATALOG);
        elementsCatalog = webDriver.findElements(ELEMENT_CATALOG);
        return this;
    }

    public boolean isElementDisplayedOnPage(CatalogCategory category) {
        for (WebElement element : elementsCatalog) {
            if (element.isDisplayed() && element.getText().equals(category.getValue())) {
                return true;
            }
        }
        return false;
    }
//    public CatalogPage selectCategory(ComputersNetworks computersNetworks){
//       elementsCatalog=webDriver.findElements();
//    }
//div[contains(@class, 'catalog') and @style='display: block;']
}
