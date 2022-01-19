package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import onliner.pages.CatalogPage;
import onliner.utils.WebDriverRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StepDefinitions {
    private CatalogPage catalogPage = new CatalogPage();

    @Given("User open main page.")
    public void userOpenMainPage() {
        catalogPage.openPage();
    }

    @When("User selects the Catalog section.")
    public void userSelectsTheCatalogSection() {
        catalogPage.openCatalogPortal();
    }

    @Then("User should see all the catalog elements of the section.")
    public void userShouldSeeAllTheCatalogElementsOfTheSection(List<String> expectedElement) {
        assertTrue(catalogPage.isCatalogElementOnPage(expectedElement));
    }

    @And("User close page.")
    public void userClosePage() {
        WebDriverRunner.close();
    }

    @And("User selects the section Computers and networks.")
    public void userSelectsTheSectionComputersAndNetworks() {
        catalogPage.selectCategoryComputersAndNetworks();
    }

    @Then("User should see all the Computers and networks elements of the section.")
    public void userShouldSeeAllTheComputersAndNetworksElementsOfTheSection(List<String> expectedElement) {
        assertTrue(catalogPage.isComputersAndNetworksElementsOnPage(expectedElement));
    }

    @And("User selects category Components.")
    public void userSelectsCategoryComponents() {
        catalogPage.selectCategoryComponents();
    }

    @Then("User should see all Components for computer have price, name, quantity.")
    public void userShouldSeeAllComponentsForComputerHavePriceNameQuantity() {
        assertTrue(catalogPage.isAllElementsContainNameQuantityAndPrice());
    }
}
