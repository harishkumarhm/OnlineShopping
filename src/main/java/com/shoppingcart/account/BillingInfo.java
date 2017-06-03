package com.shoppingcart.account;

import java.io.Serializable;

import javax.persistence.*;







@Entity
@Table(name="BILLINGINFO")
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="BILLING_TYPE",discriminatorType = DiscriminatorType.STRING,length = 1)
public abstract class BillingInfo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * User Id
     */
    @Id @GeneratedValue(strategy= GenerationType.TABLE)
    @Column(name="BILLING_ID")
    private Long billingId;

    /**
     * Person that bid
     */
    @ManyToOne
    @JoinColumn
    private Bidder bidder;
}
