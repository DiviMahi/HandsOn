
package com.dv.casting;

public class Admin extends User {
	public Admin(String name, long num) {
		super(name, num);
	}

	public void MakeAdmin() {
		System.out.println(name + " Changed to Admin...");
	}

	public void RemoveUser() {
		System.out.println(name + " Is removed...");
	}
}
 