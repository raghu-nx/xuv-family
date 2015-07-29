package com.raghuc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestMySqlDriver {  
	public static void main(String args[]) throws Exception {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HELLO_WORLD", "raghuc_all", "CrossingTest");
		PreparedStatement statement = conn.prepareStatement("select first_name from persons");
		ResultSet rs = statement.executeQuery();
		System.out.println("Printing first names");
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
	}
}
