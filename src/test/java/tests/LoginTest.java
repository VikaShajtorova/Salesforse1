package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest {

@Test
public void loginUserIsValidData(){
    boolean isHomePageOpen = loginPage.openSaleForce()
            .loginAndPassword("oubguxk-ehlf@force.com","987654321J")
            .clickLogInButton()
            .isPageOpen();
    assertTrue(isHomePageOpen);
}
}
