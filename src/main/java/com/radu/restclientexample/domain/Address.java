package com.radu.restclientexample.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Address implements Serializable {
	
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private Geo geo;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 599871659145478423L;
	
	/**
	* No args constructor for use in serialization
	*
	*/
	public Address() {
	}
	
	/**
	*
	* @param zipcode
	* @param geo
	* @param suite
	* @param city
	* @param street
	*/
	public Address(String street, String suite, String city, String zipcode, Geo geo) {
		super();
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
		this.geo = geo;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public Address withStreet(String street) {
		this.street = street;
		return this;
	}
	
	public String getSuite() {
		return suite;
	}
	
	public void setSuite(String suite) {
		this.suite = suite;
	}
	
	public Address withSuite(String suite) {
		this.suite = suite;
		return this;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address withCity(String city) {
		this.city = city;
		return this;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public Address withZipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}
	
	public Geo getGeo() {
		return geo;
	}
	
	public void setGeo(Geo geo) {
		this.geo = geo;
	}
	
	public Address withGeo(Geo geo) {
		this.geo = geo;
		return this;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public Address withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("street");
		sb.append('=');
		sb.append(((this.street == null)?"<null>":this.street));
		sb.append(',');
		sb.append("suite");
		sb.append('=');
		sb.append(((this.suite == null)?"<null>":this.suite));
		sb.append(',');
		sb.append("city");
		sb.append('=');
		sb.append(((this.city == null)?"<null>":this.city));
		sb.append(',');
		sb.append("zipcode");
		sb.append('=');
		sb.append(((this.zipcode == null)?"<null>":this.zipcode));
		sb.append(',');
		sb.append("geo");
		sb.append('=');
		sb.append(((this.geo == null)?"<null>":this.geo));
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
		result = ((result* 31)+((this.zipcode == null)? 0 :this.zipcode.hashCode()));
		result = ((result* 31)+((this.geo == null)? 0 :this.geo.hashCode()));
		result = ((result* 31)+((this.suite == null)? 0 :this.suite.hashCode()));
		result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
		result = ((result* 31)+((this.street == null)? 0 :this.street.hashCode()));
		result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
		return result;
	}

}