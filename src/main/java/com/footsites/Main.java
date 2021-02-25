package com.footsites;


public class Main {
	private static int maxTasks = 1;
	
	static Settings settings = new Settings();
	public static void main(String[] args) {

		startTasks();
	}
	
	public static void startTasks (){
		Profile testProfile = new Profile("test","Test","Test","test@gmail.com","2148391571","1 Cool Drive","apt 1","95014","Cupertino","CA","4242424242424242","12","2026","812");
		for(int i = 0; i <maxTasks; i ++){
			new FootsiteTask(Integer.toString(i), testProfile, "GW4978","08.5","footlocker").start();
		}
	}

}

