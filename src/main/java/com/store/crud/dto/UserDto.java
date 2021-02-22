package com.store.crud.dto;

import com.store.crud.model.User;
import lombok.Value;

// @Value
public class UserDto {

	private int id;
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	
//	public UserDto(User user) {
//		this.id = user.getId();
//	    this.firstName = user.getFirstName();
//	    this.lastName = user.getLastName();
//	    this.login = user.getLogin();
//	    this.password = user.getPassword();
//    }
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
} 