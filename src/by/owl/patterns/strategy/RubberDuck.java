package by.owl.patterns.strategy;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a rubber duck!");
		
	}
	@Override
	public void fly() {
		
	}
	@Override
	public void quack() {
		System.out.println("Squeak!");
	}
	
	

}
