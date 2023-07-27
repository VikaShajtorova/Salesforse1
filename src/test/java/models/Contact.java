package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Contact {
    String salutation;
    String firstName;
    String lastName;
    String accountName;
    String title;
    String phone;
    String mobile;
    String email;
    String mailingStreet;
    String mailingCity;
    String mailingZipPostalCode;
    String mailingStateProvince;
    String mailingCountry;
    String otherStreet;
    String otherCity;
    String otherZipPostalCode;
    String otherStateProvince;
    String otherCountry;
    String fax;
    String homePhone;
    String otherPhone;
    String asstPhone;
    String assistant;
    String department;
    String leadSource;
    String birthdate;
    String description;

}