package by.owl.patterns.strategy;

public class DecoyDuck extends Duck {
		
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a decoy duck");
	}
}
