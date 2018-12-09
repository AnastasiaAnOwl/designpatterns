package by.owl.patterns.strategy;

/**
 * Parent class for all ducks
 * 
 * @author anowl
 *
 */
public abstract class Duck implements FlyBehavior, QuackBehavior {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
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
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}
	

}
