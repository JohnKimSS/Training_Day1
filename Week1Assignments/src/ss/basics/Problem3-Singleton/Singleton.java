/**
 * 
 */
package com.ss.basics.wk1assign;

/**
 * @author jkim
 *
 */
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public static class SampleSingleton {

	private static Connection conn = null;
	
	private static SampleSingleton instance = null;
	
	public static SampleSingleton getInstance() {
		// implemented singleton with double checking locks 
		if(instance == null) {
			synchronized( SampleSingleton.class ) {
				if(instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) {
		// Added try-catch block to handler sql exception
		try {
		conn = DriverManager.getConnection("url of database");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		int x = 0;
		while(rs.next()) {
			x = rs.getInt(1) * input;
		}
		}catch (SQLException err) {
			err.printStackTrace();
		}
	}
}
