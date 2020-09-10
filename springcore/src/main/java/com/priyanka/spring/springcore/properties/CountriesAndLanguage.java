package com.priyanka.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguage {
	private Properties countriesAndLang;

	public Properties getCountriesAndLang() {
		return countriesAndLang;
	}

	public void setCountriesAndLang(Properties countriesAndLang) {
		this.countriesAndLang = countriesAndLang;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguage [countriesAndLang=" + countriesAndLang + "]";
	}
	
}
