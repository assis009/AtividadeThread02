package view;

import controller.Thread01;

public class Main {
	
	public static void main(String args[]){
		
		int id=0;
		//instanciando as threads 
		Thread thread01 = new Thread01(id);
		Thread thread02 = new Thread01(id);
		Thread thread03 = new Thread01(id);
		Thread thread04 = new Thread01(id);
		Thread thread05 = new Thread01(id);
	
		//rodando as threads 
		thread01.start();
		thread02.start();
		thread03.start();
		thread04.start();
		thread05.start();
		
	}
}
