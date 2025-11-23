import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest {

    @Test
    void selectTest() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDownElement = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDownElement);
        WebElement selectedOption = select.getFirstSelectedOption();
        String defaultSelectedText = selectedOption.getText();
        String expectedDefaultText = "Please select an option";

        assertEquals(defaultSelectedText, expectedDefaultText, "error");

        select.selectByVisibleText("Option 1");
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String firstOptionText = firstSelectedOption.getText();
        System.out.println(firstOptionText);
        String expectedFirstOptionText = "Option 1";
        assertEquals(firstOptionText, expectedFirstOptionText, "error option 1");
        select.selectByVisibleText("Option 2");
        WebElement secondSelectedOption = select.getFirstSelectedOption();
        String secondOptionTest = secondSelectedOption.getText();
        System.out.println(secondOptionTest);
        String expectedSecondOptionText = "Option 2";

        assertEquals(secondOptionTest, expectedSecondOptionText, "error option 2");
    }
}
