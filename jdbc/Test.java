package com.dv.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost://3306/Employees", "root",
					"Onebill@2020");
			Statement cs = connection.createStatement();
			boolean execute = cs.execute("create table stud (id int)");
			System.out.println(execute);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
