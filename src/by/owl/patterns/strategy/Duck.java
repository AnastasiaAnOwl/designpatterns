package by.owl.patterns.strategy;

/**
 * Parent class for all ducks
 * 
 * @author anowl
 *
 */
public abstract class Duck {
	
	public void quack() {
		System.out.println("Quack!");
	};
	public void swim() {
		System.out.println("Swim-swim");
	}
	public void fly( ) {
		System.out.println("Fly-fly");
	}
	public abstract void display();
	

}
