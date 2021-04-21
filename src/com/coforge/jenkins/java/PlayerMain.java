package com.coforge.jenkins.java;

public class PlayerMain {

	public static void main(String[] args) {
		Player sachin = new Player(10, "Sachin Tendulkar", "Maharashtra");
		System.out.println(sachin.getJerseyNo() + " : " + sachin.getPlayerName() + " : " + sachin.getState());
	}
}
