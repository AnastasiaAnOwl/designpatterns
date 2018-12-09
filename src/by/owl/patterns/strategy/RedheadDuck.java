package by.owl.patterns.strategy;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a red head duck");
	}
}
