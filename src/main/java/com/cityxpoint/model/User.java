package com.cityxpoint.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String username;
	private String password;
	private String email;
	private String displayName;
	private String description;
	private String twitterAccount;
	private String facebookAccount;
	private Date joinedDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	
	@Id
	@Column(length=50, nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	
	@Column(length=25, nullable=false)
	public String getUsername() {
		return username;
	}
	
	@Column(length=25, nullable=false)
	public String getPassword() {
		return password;
	}
	
	@Column(length=25, nullable=false)
	public String getEmail() {
		return email;
	}
	
	@Column(name="display_name", nullable=false)
	public String getDisplayName() {
		return displayName;
	}
	
	@Column(nullable=true)
	public String getDescription() {
		return description;
	}
	
	@Column(name="twitter_account")
	public String getTwitterAccount() {
		return twitterAccount;
	}
	
	@Column(name="facebook_account")
	public String getFacebookAccount() {
		return facebookAccount;
	}
	
	@Column(name="joined_date")
	public Date getJoinedDate() {
		return joinedDate;
	}
	
	@Column(name="created_by")
	public String getCreatedBy() {
		return createdBy;
	}
	
	@Column(name="updated_date")
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	@Column(name="updated_by")
	public String getUpdatedBy() {
		return updatedBy;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setTwitterAccount(String twitterAccount) {
		this.twitterAccount = twitterAccount;
	}
	public void setFacebookAccount(String facebookAccount) {
		this.facebookAccount = facebookAccount;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
}
