import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AuthTest extends BaseTest {

    @Test
    void authTest() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("SuperSecretPassword!");
        passwordInput.submit();
        boolean flash = driver.findElement(By.id("flash")).isDisplayed();

        assertTrue(flash);
    }
}
