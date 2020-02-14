package com.techlabs.player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player(1, "player1", 20);
		printInfo(p1);
		
		Player p2 = new Player(2, "player2", 15);
		printInfo(p2);
		
		Player OlderPlayer = p1.whoIsElder(p2);
		System.out.println("----The older player Info----");
		printInfo(OlderPlayer);
	}
	
	public static void printInfo(Player player) {
		System.out.println("----Player Info----");
		System.out.println("Id :" + player.getId());
		System.out.println("Name :" + player.getName());
		System.out.println("Age :" + player.getAge());
	}
}
