package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

@Test(description = "Проверка логина с валидными данными")
public void loginUserIsValidData(){
    boolean isHomePageOpen = loginPage.openSaleForce()
            .loginAndPassword("ewebof-bvrk@force.com","123456789J")
            .clickLogInButton()
            .isPageOpen();
    assertTrue(isHomePageOpen);
}
}
