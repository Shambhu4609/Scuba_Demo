package com.var;

public class ClassVarDemo {
	public  int age;

	private void add() {
		System.out.println(age);
	}
	public static void main(String[] args) {
		ClassVarDemo a=new ClassVarDemo();
		a.add();
		System.out.println(a.age);
	}

}
