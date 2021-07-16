package simuDuckApp;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		flyingBehaivor=new FlyNoWay();
		quackBehaivor=new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model Duck!");

	}

}
