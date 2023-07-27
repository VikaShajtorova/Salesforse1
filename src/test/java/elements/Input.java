package elements;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class Input {
    WebDriver driver;
    String label;
    String inputLocator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input | " +
            "//label[text()='%s']/ancestor::div[contains(@part,'input-text')]//input";
    String inputLocatorBirthDay = "//label[text()='%s']/ancestor::div[contains(@class,'slds-dropdown-trigger')]//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    @Step("Очищает и записывает: '{text}' в input")
    public void write(String text) {
        driver.findElement(By.xpath(String.format(inputLocator, this.label, this.label))).clear();
        log.info("Находит xpath inputLocator по его label и очищает " + inputLocator);
        driver.findElement(By.xpath(String.format(inputLocator, this.label, this.label))).sendKeys(text);
        log.info("Находит xpath inputLocator по его label и вводит " + text + " - " + inputLocator);
    }

    @Step("Очищает и записывает: '{text}' в input BirthDate")
    public void writeBirthDate(String text) {
        driver.findElement(By.xpath(String.format(inputLocatorBirthDay, this.label))).clear();
        log.info("Находит xpath inputLocatorBirthDay по его label и очищает " + inputLocatorBirthDay);
        driver.findElement(By.xpath(String.format(inputLocatorBirthDay, this.label))).sendKeys(text);
        log.info("Находит xpath inputLocatorBirthDay по его label и вводит " + text + " - " + inputLocatorBirthDay);

    }

}