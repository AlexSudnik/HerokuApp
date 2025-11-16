import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class IsSelectedCheckboxTest extends BaseTest{

@Test
    void isSelectedCheckbox(){
    //переходим на страницу
    driver.get("https://the-internet.herokuapp.com/checkboxes");

    //кладем чекбоксы в коллекцию
    List<WebElement> checkboxesList = driver.findElements(By.cssSelector("[type=checkbox]"));

    //проверка правильности создания коллекции на всякий случай
    assertEquals(checkboxesList.size(), 2);


    //проверяем выбран ли  1 чекбокс
    assertFalse(checkboxesList.get(0).isSelected(), "чекбокс 1 выбран");
    //кликаем 1 чекбокс
    checkboxesList.get(0).click();
    //проверяем после клика выыбран ли 1 чекбокс
    assertTrue(checkboxesList.get(0).isSelected(), "чекбокс 1 не выбран");


    //всё то же со вторым чекбоксом
    assertTrue(checkboxesList.get(1).isSelected(), "чекбокс 1 не выбран");
    checkboxesList.get(1).click();
    assertFalse(checkboxesList.get(1).isSelected(), "чекбокс 1 выбран");
}
}
