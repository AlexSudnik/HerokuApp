import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropdownTest extends BaseTest{

    @Test

    void selectTest(){

        //переходим на страницу
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //ищем эдемент по ид
        WebElement dropDownElement = driver.findElement(By.id("dropdown"));

        //создаем объект класса Селект
        Select select = new Select(dropDownElement);

        //получаем выбранную опцию как веб-элемент при помощи select. ....
        WebElement selectedOption = select.getFirstSelectedOption();
        //получаем текущий текст, кладем в переменную
        String defaultSelectedText = selectedOption.getText();
        //распечатать для наглядности что выбралось, (в тесте не нужно)
        System.out.println(defaultSelectedText);

        //сравниваем с ожидаемым результатом
        //текст ожидаемого результата
        String expectedDefaultText = "Please select an option";
        //сравниваем имеющийся и ожидаемый, еррор в случае несовпадения
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
