package tests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AccountTest extends BaseTest {
    @Test(description = "Проверка поля Account с валидными данными")
    public void accountShouldBeCreated() {
        loginPage.openSaleForce()
                .loginAndPassword("ewebof-bvrk@force.com","123456789J")
                .clickLogInButton();
        accountListPage.openAccountPage()
                .clickNewButton();
        Account account = AccountFactory.get();
                accountModalPage.create(account);
        accountDetailsPage.isPageOpen();
        assertEquals(accountDetailsPage.getFieldValue("Account Name"),account.getAccountName());
        assertEquals(accountDetailsPage.getFieldValue("Website"),account.getWebSite());
        assertEquals(accountDetailsPage.getFieldValue("Phone"),account.getPhone());
        assertEquals(accountDetailsPage.getFieldValue("Fax"),account.getFax());
        assertEquals(accountDetailsPage.getFieldValue("Type"),account.getType());
        assertEquals(accountDetailsPage.getFieldValue("Industry"),account.getIndustry());
        assertEquals(accountDetailsPage.getFieldValue("Employees"),account.getEmployees());
        assertEquals(accountDetailsPage.getFieldValue("Annual Revenue"),account.getAnnualRevenue() + " 000 000 000 Br");
        assertEquals(accountDetailsPage.getFieldValue("Description"),account.getDescription());
        assertEquals(accountDetailsPage.getFieldValue("Billing Address"),accountDetailsPage.getBillingAddress(account));
        assertEquals(accountDetailsPage.getFieldValue("Shipping Address"),accountDetailsPage.getShippingAddress(account));
    }
}

