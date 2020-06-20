package com.var;

public class LocalVarDemo {
	/*public void add() {
		int d=0;
		if(d==0){
			System.out.println(d+200);
		}
	}
	public static void main(String[] args) {
		LocalVarDemo a=new LocalVarDemo();
		a.add();
	}*/
	
	private void add() {
		 int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		LocalVarDemo a = new LocalVarDemo();
		a.add();
	}

}
