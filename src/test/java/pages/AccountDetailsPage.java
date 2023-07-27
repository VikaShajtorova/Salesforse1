package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2

public class AccountDetailsPage extends BasePage {

    public static final By DETAILS_LINK = By.xpath("//a[@data-label='Details']");
    String fieldValue = "//span[text() = '%s']/ancestor::records-record-layout-item//span[contains(@class, 'field-value')]";

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }
@Step("Получает текст уведомления о создании аккаунта")
    public String getNotificationTextAccount() {
    log.info("Ожидает и получает текст уведомления о создании аккаунта "+ NOTIFICATION);
        return waitAndGetText(NOTIFICATION);

    }

    public String getFieldValue(String fieldName) {
        return driver.findElement(By.xpath(String.format(fieldValue, fieldName))).getText();
    }

    public String getBillingAddress(Account account) {
        return account.getBillingStreet() + "\n" + account.getBillingCity() + ", " + account.getBillingStateProvince() +
                " " + account.getBillingZipPostalCode() + "\n" + account.getBillingCountry();
    }

    public String getShippingAddress(Account account) {
        return account.getShippingStreet() + "\n" + account.getShippingCity() + ", " + account.getShippingStateProvince() +
                " " + account.getShippingZipPostalCode() + "\n" + account.getShippingCountry();
    }


    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }
}
