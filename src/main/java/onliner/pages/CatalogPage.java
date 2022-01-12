package onliner.pages;

import onliner.enums.CatalogCategory;
import onliner.enums.ComputersNetworks;
import onliner.enums.TopMenuMainPage;
import onliner.utils.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogPage extends BasePage {
    private final By ELEMENT_CATALOG = By.xpath("//li[@class='catalog-navigation-classifier__item ']");
    private final By COMPUTERS_AND_NETWORKS = By.xpath("//li[@data-id='2']//span[contains(text(),'Компьютеры')]");
    private List<WebElement> catalogElements;

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
        return this;
    }

    public boolean isCatalogElementDisplayedOnPage(List<String> expectedCatalogElements) {
        List<WebElement> catalogElements = webDriver.findElements(ELEMENT_CATALOG);
        return Element.isElementPresent(expectedCatalogElements, catalogElements);
    }

    public CatalogPage selectCategoryComputersAndNetworks() {
        webDriver.findElement(COMPUTERS_AND_NETWORKS)
                .click();
        return this;
    }

    public boolean isComputersAndNetworksElementsDisplayedOnPage(List<String>expectedComputersNetworksElement) {
        List<WebElement> computersNetworksElements = webDriver.findElements(COMPUTERS_AND_NETWORKS);
        return Element.isElementPresent(expectedComputersNetworksElement, computersNetworksElements);

    }


}
//div[contains(@class, 'catalog') and @style='display: block;']