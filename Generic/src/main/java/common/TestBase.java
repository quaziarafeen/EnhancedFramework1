package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    final static String Url = "https://www.amazon.com";
    static WebDriver driver;

    public static void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Quazi\\IdeaProjects\\EnhancedFramework1\\Generic\\browserDriver\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile", Keys.ENTER);
        //getSearchButton();
    }
}