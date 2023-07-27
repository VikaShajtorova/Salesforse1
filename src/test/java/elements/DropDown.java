package elements;


import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DropDown {
    WebDriver driver;
    String label;

    String dropDownLocator = "//span[text() = '%s']/ancestor::div[contains(@class, 'uiInputSelect')]//div[@class='uiMenu'] | " +
            "//label[text()='%s']/ancestor::div[contains(@class,'slds-grid')]//lightning-base-combobox";
    String optionLocator = "//div[contains(@class, 'visible')]//a[text() = '%s'] | " +
            "//lightning-base-combobox-item[contains(@class, 'slds-media')]//span[text() = '%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    @Step("Выбирает опцию в DropDown")
    public void selectOption(String option) {
        driver.findElement(By.xpath(String.format(dropDownLocator, this.label, this.label))).click();
        log.info("Находит xpath DropDown по его label и кликает " + dropDownLocator);
        driver.findElement(By.xpath(String.format(optionLocator, option, option))).click();
        log.info("Находит xpath опции DropDown по её названию и кликает " + optionLocator);
    }
}
