package models;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;

public class ContactFactory {
    static Faker faker = new Faker();

    @Step("Создает новый контакт: '{faker.expression(\"Ms.\")'")

    public static Contact get() {
        return Contact.builder()
                .salutation(faker.expression("Ms."))
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .accountName(faker.expression("Ray Zenz"))
                .title(faker.harryPotter().quote())
                .phone(faker.phoneNumber().subscriberNumber(6))
                .mobile(faker.phoneNumber().subscriberNumber(12))
                .email(faker.internet().emailAddress())
                .mailingStreet(faker.address().streetAddress())
                .mailingCity(faker.address().city())
                .mailingZipPostalCode(faker.address().zipCode())
                .mailingStateProvince(faker.country().name())
                .mailingCountry(faker.country().name())
                .otherStreet(faker.address().streetAddress())
                .otherCity(faker.address().city())
                .otherZipPostalCode(faker.address().zipCode())
                .otherStateProvince(faker.country().name())
                .otherCountry(faker.country().name())
                .fax(faker.phoneNumber().subscriberNumber(6))
                .homePhone(faker.phoneNumber().subscriberNumber(6))
                .otherPhone(faker.phoneNumber().subscriberNumber(12))
                .asstPhone(faker.phoneNumber().subscriberNumber(12))
                .assistant(faker.name().firstName())
                .department(faker.company().name())
                .leadSource(faker.expression("Other"))
                .birthdate(faker.expression("21.01.1981"))
                .description(faker.harryPotter().quote())
                .build();
    }
}
