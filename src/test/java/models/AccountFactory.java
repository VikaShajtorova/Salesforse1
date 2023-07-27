package models;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;

@Log4j2

public class AccountFactory {
    static Faker faker = new Faker();

    @Step("Создает новый аккаунт: '{faker.funnyName().name()}'")
    public static Account get() {
        return Account.builder()
                .accountName(faker.funnyName().name())
                .fax(faker.phoneNumber().subscriberNumber(7))
                .billingAddress(faker.address().streetAddress())
                .accountName(faker.funnyName().name())
                .webSite(faker.internet().emailAddress())
                .phone(faker.phoneNumber().subscriberNumber(7))
                .fax(faker.phoneNumber().subscriberNumber(7))
                .type(faker.expression("Investor"))
                .industry(faker.expression("Banking"))
                .employees(faker.numerify("200"))
                .annualRevenue(faker.numerify("100"))
                .billingCity(faker.address().city())
                .billingZipPostalCode(faker.address().zipCode())
                .billingStateProvince(faker.country().name())
                .billingCountry(faker.country().name())
                .shippingCity(faker.address().city())
                .shippingZipPostalCode(faker.address().zipCode())
                .shippingStateProvince(faker.country().name())
                .shippingCountry(faker.country().name())
                .description(faker.harryPotter().spell())
                .billingStreet(faker.address().streetAddress())
                .shippingStreet(faker.address().streetAddress())
                .build();
    }
}
