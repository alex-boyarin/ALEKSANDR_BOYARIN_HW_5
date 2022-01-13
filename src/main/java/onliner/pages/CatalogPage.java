package onliner.pages;

import onliner.enums.TopMenuMainPage;
import onliner.utils.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CatalogPage extends BasePage {
    private final By ELEMENT_CATALOG = By.xpath("//li[@class='catalog-navigation-classifier__item ']");
    private final By COMPUTERS_AND_NETWORKS = By.xpath("//li[@data-id='2']//span[contains(text(),'Компьютеры и\u00a0сети')]");
    private final By ELEMENT_COMPUTERS_NETWORKS = By.xpath("//div[@data-id='2']//div[@class='catalog-navigation-list__aside-item']");
    private final By COMPONENTS = By.xpath("//div[contains(text(), ' Комплектующие ')]");
    private final By COMPONENTS_FOR_COMPUTER = By.xpath("//div[contains(text(),' Комплектующие ')]/..//a");

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

    public boolean isCatalogElementOnPage(List<String> expectedCatalogElements) {
        List<WebElement> catalogElements = webDriver.findElements(ELEMENT_CATALOG);
        return Element.isElementPresent(expectedCatalogElements, catalogElements);
    }

    public CatalogPage selectCategoryComputersAndNetworks() {
        webDriver.findElement(COMPUTERS_AND_NETWORKS)
                .click();
        return this;
    }

    public void selectCategoryComponents() {
        webDriver.findElement(COMPONENTS).click();
    }

    public boolean isComputersAndNetworksElementsOnPage(List<String> expectedComputersNetworksElement) {
        List<WebElement> computersNetworksElements = webDriver.findElements(ELEMENT_COMPUTERS_NETWORKS);
        return Element.isElementPresent(expectedComputersNetworksElement, computersNetworksElements);
    }

    public boolean isAllElementsContainNameQuantityAndPrice() {
        List<WebElement> componentsForComputer = webDriver.findElements(COMPONENTS_FOR_COMPUTER);
        return Element.isElementNotNullNotEmpty(componentsForComputer);
    }
}
