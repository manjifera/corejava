package demo;

public class Dog {
	
	String name;
	String breed;
	int cost;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog indi = new Dog();
		indi.eatfood();
		indi.bark();
		indi.sleep();
	}
	
	void eatfood() {
		System.out.println("Dog Eating dog food!");
	}
	
	void bark() {
		System.out.println("Dog barking!");		
	}
	void sleep() {
		System.out.println("Dog sleeping!");
	}
}
