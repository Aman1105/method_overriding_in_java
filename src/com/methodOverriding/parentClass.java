package com.methodOverriding;

public class parentClass {
	public void display() {
		System.out.println("This is Parent Class display method");
	}
	
	public void show() {
		System.out.println("This is Parent Class show method");
	}
	
	public void disp() {
		System.out.println("This is Parent Class disp method");
	}
	
	public class childClass extends parentClass{
		
		public void display () {
			System.out.println("This is child class display method");
		}
		
		public void show () {
			System.out.println("This is child class show method");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parentClass obj2 = new parentClass ();
		obj2.display();
		obj2.show();
		
		parentClass obj3 = new childClass ();
		obj3.display();
		obj3.show();
		
		
	

	}

}
