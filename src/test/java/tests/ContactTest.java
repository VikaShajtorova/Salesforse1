package tests;

import models.Contact;
import models.ContactFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContactTest extends BaseTest {
    @Test(description = "Проверка поля Contact с валидными данными")
    public void contactShouldBeCreated() {
        loginPage.openSaleForce()
                .loginAndPassword("bmobme-seuz@force.com","dbrnjhbz_1105")
                .clickLogInButton();
        contactListPage.openContactPage()
                .clickNewButton();
        Contact contact = ContactFactory.get();
        contactModalPage.create(contact);
        contactModalPage.isPageOpen();
        assertEquals(contactDetailsPage.getNotificationTextContact(), "Contact \""+contact.getSalutation()+" "
                +contact.getFirstName()+" "+ contact.getLastName()+"\" was created.");
        assertEquals(contactDetailsPage.getFieldValue("Account Name"),contactDetailsPage.getAccountName(contact));
        assertEquals(contactDetailsPage.getFieldValue("Name"),contactDetailsPage.getName(contact));
        assertEquals(contactDetailsPage.getFieldValue("Title"),contact.getTitle());
        assertEquals(contactDetailsPage.getFieldValue("Phone"),contact.getPhone());
        assertEquals(contactDetailsPage.getFieldValue("Mobile"),contact.getMobile());
        assertEquals(contactDetailsPage.getFieldValue("Email"),contact.getEmail());
        assertEquals(contactDetailsPage.getFieldValue("Mailing Address"),contactDetailsPage.getMailingAddress(contact));
        assertEquals(contactDetailsPage.getFieldValue("Other Address"),contactDetailsPage.getOtherAddress(contact));
        assertEquals(contactDetailsPage.getFieldValue("Fax"),contact.getFax());
        assertEquals(contactDetailsPage.getFieldValue("Home Phone"),contact.getHomePhone());
        assertEquals(contactDetailsPage.getFieldValue("Other Phone"),contact.getOtherPhone());
        assertEquals(contactDetailsPage.getFieldValue("Asst. Phone"),contact.getAsstPhone());
        assertEquals(contactDetailsPage.getFieldValue("Assistant"),contact.getAssistant());
        assertEquals(contactDetailsPage.getFieldValue("Description"),contact.getDescription());
        assertEquals(contactDetailsPage.getFieldValue("Department"),contact.getDepartment());
        assertEquals(contactDetailsPage.getFieldValue("Lead Source"),contact.getLeadSource());
        assertEquals(contactDetailsPage.getFieldValue("Birthdate"),contact.getBirthdate());
}
}
