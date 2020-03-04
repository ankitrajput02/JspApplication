package com.bridgelabz.connection;

/**
 * Getter Setter methods to read and write data
 *
 */
public class UserDetails {
	String firstName;
	String lastName;
	String email;
	String mobile;
	String firstPass;
	String lastPass;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFirstPass() {
		return firstPass;
	}
	public void setFirstPass(String firstPass) {
		this.firstPass = firstPass;
	}
	public String getLastPass() {
		return lastPass;
	}
	public void setLastPass(String lastPass) {
		this.lastPass = lastPass;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile="
				+ mobile + ", firstPass=" + firstPass + ", lastPass=" + lastPass + "]";
	}


}
