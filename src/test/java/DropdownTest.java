import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest{

    @Test

    void selectTest(){

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDownElement = driver.findElement(By.id("dropdown"));

        Select select = new Select(dropDownElement);

        WebElement selectedOption = select.getFirstSelectedOption();
        String defaultSelectedText = selectedOption.getText();
        System.out.println(defaultSelectedText);

        //сравниваем с ожидаемым результатом
        String expectedDefaultText = "Please select an option";
        assertEquals(defaultSelectedText, expectedDefaultText, "error");

        //выбрать 1 опцию
        select.selectByVisibleText("Option 1");

        //смотрим текст 1 выбранной опции
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String firstOptionText = firstSelectedOption.getText();
        System.out.println(firstOptionText);

        //сравниваем с ожидаемым результатом
        String expectedFirstOptionText = "Option 1";
        assertEquals(firstOptionText, expectedFirstOptionText, "error option 1");

        //выбрать 2 опцию
        select.selectByVisibleText("Option 2");

        //смотри текст 2 выбранной опции
        WebElement secondSelectedOption = select.getFirstSelectedOption();
        String secondOptionTest = secondSelectedOption.getText();
        System.out.println(secondOptionTest);

        //сравниваем с ожидаемым результатом
        String expectedSecondOptionText = "Option 2";
        assertEquals(secondOptionTest, expectedSecondOptionText, "error option 2");
    }
}
