package com.Boot.Application.Model;

import javax.persistence.*;

@Entity
public class EmployeePersonal {
	@Id
	private String homeTown;
	private String hobbie;
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getHobbie() {
		return hobbie;
	}
	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

}
