package controller;

public class Thread02 extends Thread {
int id=0;
	
	public Thread02(int id) {
		this.id = id;
	}
	public void run() {
		id = (int) getId();
		System.out.println("ID #" + id);//printando o id da thread  
	}
}
