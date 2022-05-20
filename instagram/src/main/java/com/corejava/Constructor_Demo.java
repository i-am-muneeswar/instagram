package com.corejava;

public class Constructor_Demo extends Object {
	
	int i;
	int j;

	Constructor_Demo(){
		
	}
	
	Constructor_Demo(int k, int l){
		this.i=k;
		this.j=l;
	}
	
	public void add() {
		System.out.println(i+j);
	}
	
	public static void main(String[] args) {
		
		Constructor_Demo cd = new Constructor_Demo();
		Constructor_Demo cd1 = new Constructor_Demo(2,4);
		
		cd.add();
		cd1.add();

	}

}
