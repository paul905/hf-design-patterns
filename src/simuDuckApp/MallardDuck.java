package simuDuckApp;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		 quackBehaivor=new Quack();
		 flyingBehaivor=new FlyWithWings();
	}
	

	@Override
	public void display() {
		System.out.println("I'm a real Mallard Duck !");
	}

}
