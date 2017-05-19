public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		setFlyBehavior(new CantFly());
		setQuackBehavior(new Silence());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}