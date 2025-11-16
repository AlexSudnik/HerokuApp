import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class AddRemoveElementsTest extends BaseTest{

  @Test
  void removeAddTest(){
      //переходим на страницу
      driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
      //находим кнопку адд элемент
      WebElement addButton = driver.findElement(By.cssSelector("[onclick='addElement()']"));
      //нажимаем 2 раза
      addButton.click();
      addButton.click();
      //кладем все кнопки делете в коллекцию, создаем переменную
      List<WebElement> deleteButtons = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
      //проверяем что в коллекции 2 элемента
      assertEquals(deleteButtons.size(), 2);
      //нажимаем первый элемент
      deleteButtons.get(0).click();
      //перезаписываем коллекцию (?) теперь там 1 элемент
      deleteButtons = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
      //проверяем
      assertEquals(deleteButtons.size(), 1);
  }
}
