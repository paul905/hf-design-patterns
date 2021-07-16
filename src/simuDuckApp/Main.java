package simuDuckApp;

public class Main {

	public static void main(String[] args) {
		Duck duck=new MallardDuck();
		
		duck.performQuack();
		duck.performFly();
		duck.display();
		
		System.out.println("");
		
		Duck modelDuck=new ModelDuck();
		
		modelDuck.performQuack();
		modelDuck.performFly();
		modelDuck.display();
		
		// change "on fly" flying behaviour of Model Duck
		
		modelDuck.setFlyingBehaivor(new FlyRocketPowered());
		modelDuck.performFly();
		
	}

}
