package com.priyanka.spring.springcore.propertyplaceholder;

public class MyDAO {
	/*
	 * private String dbServer;
	 * 
	 * public MyDAO(String dbServer) { super(); this.dbServer = dbServer; }
	 * 
	 * @Override public String toString() { return "MyDAO [dbServer=" + dbServer +
	 * "]"; }
	 */

	/*
	 * private String dbUser;
	 * 
	 * public MyDAO(String dbUser) { super(); this.dbUser = dbUser; }
	 * 
	 * @Override public String toString() { return "MyDAO [dbUser=" + dbUser + "]";
	 * }
	 */

	private String url;

	public MyDAO(String url) {
		super();
		this.url = url;
	}

	@Override
	public String toString() {
		return "MyDAO [url=" + url + "]";
	}

}
