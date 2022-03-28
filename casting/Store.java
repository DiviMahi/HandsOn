package com.dv.casting;

public class Store {
	public static void main(String[] args) {
		// ===UPCASTING===
		User user = new Admin("Divya", 797792819);
		user.call();
		user.msg();
		// ===DOWNCASTING===
		Admin admin = (Admin) user;
		admin.MakeAdmin();
		admin.RemoveUser();

	}
} 
