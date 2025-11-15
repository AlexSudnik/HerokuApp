import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class IsSelectedCheckboxTest extends BaseTest{

@Test
    void isSelectedCheckbox(){
    driver.get("https://the-internet.herokuapp.com/checkboxes");

    List<WebElement> checkboxesList = driver.findElements(By.cssSelector("[type=checkbox]"));
    assertEquals(checkboxesList.size(), 2);

    assertFalse(checkboxesList.get(0).isSelected(), "чекбокс 1 выбран");
    checkboxesList.get(0).click();
    assertTrue(checkboxesList.get(0).isSelected(), "чекбокс 1 не выбран");

    assertTrue(checkboxesList.get(1).isSelected(), "чекбокс 1 не выбран");
    checkboxesList.get(1).click();
    assertFalse(checkboxesList.get(1).isSelected(), "чекбокс 1 выбран");
}
}
