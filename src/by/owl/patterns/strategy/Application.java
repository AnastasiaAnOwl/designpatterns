package by.owl.patterns.strategy;

public class Application {
	
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
	}

}
