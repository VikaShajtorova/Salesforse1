package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String inputLocator = "//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input | //label[text()='%s']/ancestor::div[contains(@part,'input-text')]//input";
    String inputLocatorBirthDay = "//label[text()='%s']/ancestor::div[contains(@class,'slds-dropdown-trigger')]//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void write(String text){
        driver.findElement(By.xpath(String.format(inputLocator,this.label,this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocator,this.label,this.label))).sendKeys(text);
    }
    public void writeBirthDate(String text){
        driver.findElement(By.xpath(String.format(inputLocatorBirthDay,this.label,this.label))).clear();
        driver.findElement(By.xpath(String.format(inputLocatorBirthDay,this.label,this.label))).sendKeys(text);

    }

}