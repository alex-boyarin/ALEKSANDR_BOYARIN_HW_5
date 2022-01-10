package onliner.pages;

import onliner.enums.CatalogCategory;
import onliner.enums.TopMenuMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogPage extends BasePage {
    private final By ELEMENT_CATALOG = By.xpath("//li[@class='catalog-navigation-classifier__item ']");
    private List<WebElement> listElements;

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
        listElements = webDriver.findElements(ELEMENT_CATALOG);
        return this;
    }

    public boolean isElementDisplayedOnPage(List<CatalogCategory> categories) {
        boolean check = false;
        for (CatalogCategory category : categories) {
            check = false;
            for (WebElement element : listElements) {
                if (element.isDisplayed() && element.getText().equals(category.getValue())) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Категория \"" + category.getValue() + "\" отсутствует либо название изменено!!!");
                return false;
            }
        }
        listElements = null;
        return check;
    }
//    public CatalogPage selectCategory(ComputersNetworks computersNetworks){
//       elementsCatalog=webDriver.findElements();
//    }
//div[contains(@class, 'catalog') and @style='display: block;']
}
