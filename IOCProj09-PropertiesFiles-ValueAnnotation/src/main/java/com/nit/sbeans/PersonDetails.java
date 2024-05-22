package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pDetails")
public class PersonDetails {
	
	
	//Getting the values from the properties files
	@Value("${per.id}")
	private Integer pid;
	
	@Value("${per.name}")
	private String pname;
	
	@Value("${per.city}")
	private String city;
	
	@Value("${per.phone}")
	private Long phno;
	
	//Injecting hardcoded values
	@Value("nlashetti543@gmail.com")
	private String email;
	
	
	//injecting system property values
	@Value("${os.name}")
	private String os_name;
	
	@Value("${os.version}")
	private String os_version;
	
	//injecting environment variables values
	@Value("${Path}")
	private String pathData;

	@Override
	public String toString() {
		return "PersonDetails [pid=" + pid + ", pname=" + pname + ", city=" + city + ", phno=" + phno + ", email="
				+ email + ", os_name=" + os_name + ", os_version=" + os_version + ", pathData=" + pathData
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
