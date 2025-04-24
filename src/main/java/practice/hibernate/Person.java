package practice.hibernate;

import jakarta.persistence.*;

@Entity
public class Person {
	@Id
	int id;
	String nickname;
	@OneToOne
	Aadhar card;
	
	public Person() {
		super();
	}

	public Person(int id, String nickname, Aadhar card) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.card = card;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Aadhar getCard() {
		return card;
	}

	public void setCard(Aadhar card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nickname=" + nickname + ", card=" + card + "]";
	}
	
}
