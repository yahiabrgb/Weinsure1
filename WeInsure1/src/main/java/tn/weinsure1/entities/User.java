package tn.weinsure1.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="User")
public class User implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="IdUser")
	private Long idUser ;
	
	@Column(name="Lastname")
	private String lastname ;
	
	@Column(name="Firstname")
	private String firstname ;
	
	@Temporal(TemporalType.DATE)
	@Column(name="Birthdate")
	private Date birthdate ;
	
	
	@Column(name="Login")
	private String login ;
	
	@Column(name="Password")
	private String paswword ;
	
	
	@Column(name="Phonenumber")
	private Long phonenumber ;
	
	@Column(name="Cin")
	private Long cin ;
	
	@Column(name="Salary")
	private Float salary ;
	
	
	@Enumerated(EnumType.STRING)
    @Column(name="Role")
	UserRole role;
	
	public enum UserRole{
		Insurer,Insured,Administrator}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPaswword() {
		return paswword;
	}

	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Long getCin() {
		return cin;
	}

	public void setCin(Long cin) {
		this.cin = cin;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	/**
	 * @param idUser
	 * @param lastname
	 * @param firstname
	 * @param birthdate
	 * @param login
	 * @param paswword
	 * @param phonenumber
	 * @param cin
	 * @param salary
	 * @param role
	 */
	public User(Long idUser, String lastname, String firstname, Date birthdate, String login, String paswword,
			Long phonenumber, Long cin, Float salary, UserRole role) {
		super();
		this.idUser = idUser;
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthdate = birthdate;
		this.login = login;
		this.paswword = paswword;
		this.phonenumber = phonenumber;
		this.cin = cin;
		this.salary = salary;
		this.role = role;
	}
	
	public User( String lastname, String firstname, Date birthdate, String login, String paswword,
			long i, long j, float k, UserRole role) {

		this.lastname = lastname;
		this.firstname = firstname;
		this.birthdate = birthdate;
		this.login = login;
		this.paswword = paswword;
		this.phonenumber = i;
		this.cin = j;
		this.salary = k;
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", lastname=" + lastname + ", firstname=" + firstname + ", birthdate="
				+ birthdate + ", login=" + login + ", paswword=" + paswword + ", phonenumber=" + phonenumber + ", cin="
				+ cin + ", salary=" + salary + ", role=" + role + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







}