package com.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.*;

import com.shoppingcart.account.Address;



/**
 * Entity implementation class for Entity: Billing
 *
 */
@Entity
@Table(name="BILLING_INFO")
public class Billing implements Serializable {

    @Id
    @Column(name="BILLING_USER_ID")
    protected Long userId;
    

    /**
     * Account number
     */
    protected String accountNumber;

    /**
     * Expiration date on the account
     */
    protected String expiryDate;

    /**
     * Security code on the card
     */
    protected String secretCode;

    /**
     * Address associated with the card
     */
    protected Address address;

    /**
     * Returns the account number
     * @return account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns the expiration date
     * @return expiration date
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Returns the secret code
     * @return secret code
     */
    public String getSecretCode() {
        return secretCode;
    }

    /**
     * Returns the address
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the account number
     * @param accountNumber - account number
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Sets the expiration date
     * @param expiryDate - expiration date
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Sets the secret code
     * @param secretCode - secret code
     */
    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    /**
     * Sets the address
     * @param address - address
     */
    public void setAddress(Address address) {
        this.address = address;
    }
}

