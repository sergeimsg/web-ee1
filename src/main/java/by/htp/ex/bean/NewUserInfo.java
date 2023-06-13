package by.htp.ex.bean;

import java.util.Objects;

public class NewUserInfo {
	private String email;
	private String password;
	private String name;
	private String surname;
	private String role;
	
	public NewUserInfo() {
		super();
	}

	public NewUserInfo(String email, String password, String name, String surname, String role) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, name, password, role, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewUserInfo other = (NewUserInfo) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(password, other.password) && Objects.equals(role, other.role)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "NewUserInfo [email=" + email + ", password=" + password + ", name=" + name + ", surname=" + surname
				+ ", role=" + role + "]";
	}
	
	
	
	
	
	
}
