package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

@Test(description = "Проверка логина с валидными данными")
public void loginUserIsValidData(){
    boolean isHomePageOpen = loginPage.openSaleForce()
            .loginAndPassword("bmobme-seuz@force.com","dbrnjhbz_1105")
            .clickLogInButton()
            .isPageOpen();
    assertTrue(isHomePageOpen);
}
}
