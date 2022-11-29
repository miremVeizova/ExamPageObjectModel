package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    protected static void click(WebElement element) {
        element.click();
    }

    protected static void selectByValue(WebElement element, String value){
        Select selectFromDropDown = new Select(element);
        selectFromDropDown.selectByValue(value);
    }

}
