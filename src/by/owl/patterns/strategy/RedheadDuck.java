package by.owl.patterns.strategy;

public class RedheadDuck extends Duck {

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

	@Override
	public void swim() {
		System.out.println("swim-swim");
	}

	@Override
	public void display() {
		System.out.println("I'm a red head duck");
	}

}
