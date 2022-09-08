package com.radu.restclientexample.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class Company implements Serializable {
	
	private String name;
	private String catchPhrase;
	private String bs;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2988509671082244621L;
	
	/**
	* No args constructor for use in serialization
	*
	*/
	public Company() {
	}
	
	/**
	*
	* @param bs
	* @param catchPhrase
	* @param name
	*/
	public Company(String name, String catchPhrase, String bs) {
		super();
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Company withName(String name) {
		this.name = name;
		return this;
	}
	
	public String getCatchPhrase() {
		return catchPhrase;
	}
	
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	
	public Company withCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
		return this;
	}
	
	public String getBs() {
		return bs;
	}
	
	public void setBs(String bs) {
		this.bs = bs;
	}
	
	public Company withBs(String bs) {
		this.bs = bs;
		return this;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
	
	public Company withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Company.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null)?"<null>":this.name));
		sb.append(',');
		sb.append("catchPhrase");
		sb.append('=');
		sb.append(((this.catchPhrase == null)?"<null>":this.catchPhrase));
		sb.append(',');
		sb.append("bs");
		sb.append('=');
		sb.append(((this.bs == null)?"<null>":this.bs));
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
		result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
		result = ((result* 31)+((this.bs == null)? 0 :this.bs.hashCode()));
		result = ((result* 31)+((this.catchPhrase == null)? 0 :this.catchPhrase.hashCode()));
		result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
		return result;
	}

}