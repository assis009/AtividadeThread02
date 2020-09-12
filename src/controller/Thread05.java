package controller;

public class Thread05 extends Thread {

	int id=0;
	
	public Thread05(int id) {
		this.id = id;
	}
	public void run() {
		id = (int) getId();
		System.out.println("ID #" + id);//printando o id da thread  
	}
}
