package elements;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2

public class TextArea {
    WebDriver driver;
    String label;
    String textAreaLocator = "//span[text()='%s']/ancestor::div[contains(@class,'textarea')]//textarea | " +
            "//label[text()='%s']/ancestor::div[contains(@class,'slds-form-element__row')]//textarea | " +
            "//label[text()='%s']/ancestor::div[contains(@class,'slds-grid slds-size_1-of-1')]//textarea";
    String contactDescriptionTextAreaLocator = "//label[text()='%s']/ancestor::div[contains(@class,'slds-grid slds-size_1-of-1')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    @Step("Очищает и записывает: '{text}' в textAreaLocator")
    public void write(String text) {
        driver.findElement(By.xpath(String.format(textAreaLocator, this.label, this.label, this.label))).clear();
        log.info("Находит xpath textAreaLocator по его label и очищает " + textAreaLocator);
        driver.findElement(By.xpath(String.format(textAreaLocator, this.label, this.label, this.label))).sendKeys(text);
        log.info("Находит xpath textAreaLocator по его label и вводит " + text + " - " + textAreaLocator);
    }

    @Step("Очищает и записывает: '{text}' в contactDescriptionTextAreaLocator")
    public void writeContactDescription(String text) {
        driver.findElement(By.xpath(String.format(contactDescriptionTextAreaLocator, this.label))).clear();
        log.info("Находит xpath contactDescriptionTextAreaLocator по его label и очищает " + contactDescriptionTextAreaLocator);
        driver.findElement(By.xpath(String.format(contactDescriptionTextAreaLocator, this.label))).sendKeys(text);
        log.info("Находит xpath contactDescriptionTextAreaLocator по его label и вводит " + text + " - " + contactDescriptionTextAreaLocator);
    }
}
