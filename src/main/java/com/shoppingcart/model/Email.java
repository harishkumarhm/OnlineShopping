package com.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Entity implementation class for Entity: Email
 *
 */
@Entity
@Table(name = "EMAIL")
public class Email implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Email identifier
     */
    @Id
    @Column(name="EMAIL_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @TableGenerator(name = "ITEM_TABLE_GEN", table = "sequence",
            pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT",
            pkColumnValue = "ITEM_SEQ")
    private Long emailId;

    /**
     * Function of the email
     */
    @NotNull
    @Size(min=3,max=45)
    private String action;

    /**
     * Email subject
     */
    @NotNull
    @Size(min=3,max=45)
    private String subject;
    
    /**
     * Html content of the email
     */
    @NotNull
    @Lob
    private String htmlContent;

    /**
     * Plain content
     */
    @NotNull
    @Lob
    private String plainContent;

    /**
     * Default constructor for JPA
     */
    public Email() {
        // default constructor for JPA
    }

    /**
     * Constructs a new email
     * @param action - purpose of the email
     * @param subject - subject of the email
     * @param htmlContent - html content of the email
     */
    public Email(String action, String subject, String htmlContent) {
        this.action = action;
        this.subject = subject;
        this.htmlContent = htmlContent;
    }

    /**
     * Returns the email id
     * @return email id
     */
    public Long getEmailId() {
        return emailId;
    }

    /**
     * Sets the email id
     * @param emailId - email id
     */
    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }

    /**
     * Returns the action (purpose) of the email
     * @return email function
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the function of the email
     * @param action - email action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Returns the subject to be used on the email
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the subject on the email
     * @param subject - email subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Returns the raw content of the email
     * @return email content
     */
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * Sets the email content
     * @param htmlContent - email content
     */
    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    /**
     * Returns the plain content
     * @return plain content
     */
    public String getPlainContent() {
        return plainContent;
    }

    /**
     * Sets the plain content
     * @param plainContent - plain content
     */
    public void setPlainContent(String plainContent) {
        this.plainContent = plainContent;
    }
}
