package com.shoppingcart.account;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



/**
 * Entity implementation class for Entity: Address
 *
 */
@Embeddable

public class Address implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	 /**
     * Street name - first line
     */
    @NotNull
    @Size(min=2,max=30,message="{streetNameSize}")
    private String streetName1;

    /**
     * City
     */
    @NotNull
    @Size(min=2,max=30,message="{citySize}")
    private String city;
   
    /**
     * Zip code
     */
    @NotNull
    @Size(min=5,max=5,message="{zipCodeSize}")
    private String zipCode;

    /**
     * Phone number
     */
    @Size(min=10,max=10)
    private String phone;
    
    /**
     * No-arg constructor for JPA
     */
    public Address() {}
    
    /**
     * Constructs a new address with the information provided
     * @param streetName1 - street name
     * @param city - city
     * @param state - state
     * @param zipCode - zip code
     * @param phone - phone
     */
    public Address(String streetName1, String city,  String zipCode, String phone) {
        this.streetName1 = streetName1;
        this.city = city;
      
        this.zipCode = zipCode;
        this.phone = phone;
    }

    /**
     * Returns the street - line 1
     * @return street line 1
     */
    public String getStreetName1() {
        return streetName1;
    }

    /**
     * Returns the city
     * @return city
     */
    public String getCity() {
        return city;
    }

 

    /**
     * Returns the zip code
     * @return zip code
     */
    @Column(name = "ZIP_CODE")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the street name line 1
     * @param streetName1 - line 1 street
     */
    public void setStreetName1(String streetName1) {
        this.streetName1 = streetName1;
    }

    /**
     * Sets the street name line 2
     * @param streetName2 - street name line 2
     */
    public void setStreetName2(String streetName2) {
        this.streetName1 = streetName2;
    }

    /**
     * Sets the city
     * @param city - city
     */
    public void setCity(String city) {
        this.city = city;
    }

 
    /**
     * Sets the zip code
     * @param zipCode - zip code
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Returns the phone number
     * @return phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number
     * @param phone - phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
   
}
