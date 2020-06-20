package com.var;

public class StaticVar {
	public static int age;

	public static void add() {
		System.out.println(age);
		age = 100;
	}

	public static void main(String[] args) {
		add();
		System.out.println(age);
	}

}
