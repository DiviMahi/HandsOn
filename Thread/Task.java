package com.dv.Thread;

public class Task extends Thread {
	int val;

	public Task(int val) {
		super();
		this.val = val;
	}

	@Override
	public void run() {
		while (val > 0) {
			if (val % 2 == 0) {
				System.out.println(val);

			}

			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();

			}
			val--;
		}

	}

	public static void main(String[] args) {
		Task t = new Task(20);
		t.start();
		Task t1 = new Task(10);
		t1.start();

	}

}
