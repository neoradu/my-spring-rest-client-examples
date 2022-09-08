package com.radu.restclientexample.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable
{
	private Integer id;
	private String name;
	private String username;
	private String email;
	private Address address;
	private String phone;
	private String website;
	private Company company;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -3367535187875282017L;
	
	/**
	* No args constructor for use in serialization
	*
	*/
	public User() {
	}
	
	/**
	*
	* @param website
	* @param address
	* @param phone
	* @param name
	* @param company
	* @param id
	* @param email
	* @param username
	*/
	public User(Integer id, String name, String username, String email,
			    Address address, String phone, String website, Company company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public User withId(Integer id) {
		this.id = id;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public User withName(String name) {
		this.name = name;
		return this;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public User withUsername(String username) {
		this.username = username;
		return this;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User withEmail(String email) {
		this.email = email;
		return this;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public User withAddress(Address address) {
		this.address = address;
		return this;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public User withPhone(String phone) {
		this.phone = phone;
		return this;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public void setWebsite(String website) {
		this.website = website;
	}
	
	public User withWebsite(String website) {
		this.website = website;
		return this;
	}
	
	public Company getCompany() {
		return company;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	public User withCompany(Company company) {
		this.company = company;
		return this;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public User withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(User.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("id");
		sb.append('=');
		sb.append(((this.id == null)?"<null>":this.id));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null)?"<null>":this.name));
		sb.append(',');
		sb.append("username");
		sb.append('=');
		sb.append(((this.username == null)?"<null>":this.username));
		sb.append(',');
		sb.append("email");
		sb.append('=');
		sb.append(((this.email == null)?"<null>":this.email));
		sb.append(',');
		sb.append("address");
		sb.append('=');
		sb.append(((this.address == null)?"<null>":this.address));
		sb.append(',');
		sb.append("phone");
		sb.append('=');
		sb.append(((this.phone == null)?"<null>":this.phone));
		sb.append(',');
		sb.append("website");
		sb.append('=');
		sb.append(((this.website == null)?"<null>":this.website));
		sb.append(',');
		sb.append("company");
		sb.append('=');
		sb.append(((this.company == null)?"<null>":this.company));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length()- 1)) == ',') {
			sb.setCharAt((sb.length()- 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		result = ((result* 31)+((this.website == null)? 0 :this.website.hashCode()));
		result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
		result = ((result* 31)+((this.phone == null)? 0 :this.phone.hashCode()));
		result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
		result = ((result* 31)+((this.company == null)? 0 :this.company.hashCode()));
		result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
		result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
		result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
		result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
		return result;
	}

}
