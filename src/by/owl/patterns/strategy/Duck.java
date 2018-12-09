package by.owl.patterns.strategy;

/**
 * Parent class for all ducks
 * 
 * @author anowl
 *
 */
public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;


	public void swim() {
		System.out.println("Swim-swim");
	}

	public abstract void display();

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void sqim() {
		System.out.println("All ducks float, even decoys!");
	}

	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior (QuackBehavior qb) {
		quackBehavior = qb;
	}
}
