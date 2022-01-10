package onlinerTests;

import onliner.enums.CatalogCategory;
import onliner.pages.CatalogPage;
import onliner.utils.WebDriverRunner;
import onlinerTests.provider.CatalogElementProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CatalogPageTest {
    private static final CatalogPage catalogPage = new CatalogPage();

    @BeforeAll
    public static void init() {
        catalogPage.openPage();
    }

    @BeforeEach
    public void setUp() {
        catalogPage.openCatalogPortal();
    }

    @AfterEach
    public void tearDown() {
        WebDriverRunner.close();
    }

    @ParameterizedTest
    @ArgumentsSource(CatalogElementProvider.class)
    @DisplayName("Catalog elements on page")
    public void isElementDisplayedOnPage(List<CatalogCategory> categories) {
        assertTrue(catalogPage.isElementDisplayedOnPage(categories));
    }
}