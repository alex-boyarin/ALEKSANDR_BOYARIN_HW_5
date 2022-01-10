package onlinerTests;

import onliner.enums.CatalogCategory;
import onliner.pages.CatalogPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

class CatalogPageTest {
    private static final CatalogPage catalogPage = new CatalogPage();

    @BeforeAll
    public static void init() {
        catalogPage.openPage();

    }


    @BeforeEach
    void setUp() {
        catalogPage.openCatalogPortal();
    }

    @AfterEach
    void tearDown() {
    }


    @ParameterizedTest
    @EnumSource(value = CatalogCategory.class)
    void isElementDisplayedOnPage(CatalogCategory category) {
        assertTrue(catalogPage.isElementDisplayedOnPage(category));
    }
}