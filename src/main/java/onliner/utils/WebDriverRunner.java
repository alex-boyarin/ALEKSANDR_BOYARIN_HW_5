package onliner.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRunner {
    private static WebDriver webDriver;

    private WebDriverRunner() {
    }

    private static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    public static WebDriver getDriver() {
        if (webDriver == null) {
            initDriver();
        }
        return webDriver;
    }

    public static void close() {
        webDriver.quit();
        webDriver = null;
    }
}
