package simuDuckApp;

public abstract class Duck {

	FlyBehavior flyingBehaivor;
	QuackBehavior quackBehaivor;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {

		flyingBehaivor.fly();

	}

	public void performQuack() {

		quackBehaivor.quack();

	}

	public void swim() {

		System.out.println("All ducks float, even decoys!");

	}

	public void setFlyingBehaivor(FlyBehavior flyingBehaivor) {
		this.flyingBehaivor = flyingBehaivor;
	}

	public void setQuackBehaivor(QuackBehavior quackBehaivor) {
		this.quackBehaivor = quackBehaivor;
	}
	
	

}
