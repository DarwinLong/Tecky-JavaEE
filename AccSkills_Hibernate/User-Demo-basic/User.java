package com.hibernate.model;

import java.util.Date;

public class User {
	private int id = 0;
	private String userName;
	private String name;
	private String plainPassword;
	private String encryptedPassword;
	private String tell;
	private String email;
	private Date createDate;
	private Date updateDate;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPlainPassword() {
		return plainPassword;
	}


	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}


	public String getEncryptedPassword() {
		return encryptedPassword;
	}


	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}


	public String getTell() {
		return tell;
	}


	public void setTell(String tell) {
		this.tell = tell;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[User : id=" + id + ", name=" + name + "]";
	}

}
