package controller;

public class Thread01 extends Thread {
	int id=0;
	
	public Thread01(int id) {
		this.id = id;
	}
	public void run() {
		id = (int) getId();
		System.out.println("ID #" + id);//printando o id da thread  
	}
}
