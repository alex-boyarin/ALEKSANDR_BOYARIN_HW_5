package onliner.utils;

import org.openqa.selenium.WebElement;

import java.util.List;

public final class Element {
    private Element() {
    }

    public static boolean isElementPresent(List<String> expectedElements, List<WebElement> actualElements) {
        boolean check = false;
        for (String expectedElement : expectedElements) {
            check = false;
            for (WebElement actualElement : actualElements) {
                if (expectedElement.equals(actualElement.getText().trim()) && actualElement.isDisplayed()) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Категория \"" + expectedElement + "\" отсутствует либо название изменено!!!");
                return false;
            }
        }
        return check;
    }

    public static boolean isElementNotNullNotEmpty(List<WebElement> elements) {
        for (WebElement element : elements) {
            if (element == null || element.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
