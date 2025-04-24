package practice.hibernate;

import jakarta.persistence.*;

@Entity
public class Aadhar {
	@Id
	int aadharNumber;
	String name;
	String address;
	String gender;
	@OneToOne
	Person person;
	
	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Aadhar(int aadharNumber, String name, String address, String gender, Person person) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.person = person;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Aadhar [aadharNumber=" + aadharNumber + ", name=" + name + ", address=" + address + ", gender=" + gender
				+ ", person=" + person + "]";
	}
}
