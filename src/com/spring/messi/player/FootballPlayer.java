package com.spring.messi.player;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class FootballPlayer {
	
	@NotNull(message="First Name should not be empty")
	@Size(min=4,max=15,message="Please enter a valid name")
	private String firstName;

	@Pattern(regexp = "",message="")
	private String lastName;

	private String country;
	
	private LinkedHashMap<String,String> countryMap = new LinkedHashMap<String,String>();
	
	private String[] playerCharacter;
	
	public String[] getPlayerCharacter() {
		return playerCharacter;
	}

	public void setPlayerCharacter(String[] playerCharacter) {
		this.playerCharacter = playerCharacter;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@NotNull(message="Enter a valid user")
	private Integer age;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public FootballPlayer() {
		super();
		countryMap.put("IND", "India");
		countryMap.put("BRZ", "Brazil");
		countryMap.put("USA", "America");
		countryMap.put("UK", "Britain");
	}

	public LinkedHashMap<String, String> getCountryMap() {
		return countryMap;
	}

	public String getFirstName() {
		System.out.println("FirstName getters is called");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("FirstName setters is called");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "FootballPlayer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
