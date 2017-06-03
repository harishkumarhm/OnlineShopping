package com.shoppingcart.account;

import java.io.Serializable;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Group
 *
 */
@Entity

public class Group implements Serializable {

	
	  /**
     * User Id
     */
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    @Column(name="group_pk")
    private Long userId;

    /**
     * Reference back to the user
     */
    @ManyToOne @JoinColumn
    private User user;
    
    /**
     * User name
     */
    @Column(name="username")
    private String username;
    
    /**
     * Group identifier
     */
    @Column(name="groupid")
    private String groupId;

    /**
     * Default constructor for JPA
     */
    protected Group() {}

    /**
     * Creates a new group with the specified ID
     * @param groupId - group id
     */
    public Group(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Sets the group ID
     * @param groupId - groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Returns the username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username
     * @param username - username
     */
    protected void setUsername(String username) {
        this.username = username;
    }
}
