package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class Account {
    String accountName;
    String webSite;
    String phone;
    String fax;
    String type;
    String industry;
    String employees;
    String annualRevenue;
    String billingCity;
    String billingZipPostalCode;
    String billingStateProvince;
    String billingCountry;
    String shippingCity;
    String shippingZipPostalCode;
    String shippingStateProvince;
    String shippingCountry;
    String description;
    String billingStreet;
    String shippingStreet;
    String billingAddress;
    String shippingAddress;


}

