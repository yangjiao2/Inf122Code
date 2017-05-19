import java.util.*;

public class DuckSimulator {
	
	public static void processDucks(List<Duck> ducks) {
		for (Duck d : ducks) {
			System.out.println("--------------------");
			System.out.println("Name: " + d.getClass().getName());
			d.display();
			d.performQuack();
			d.performFly();
			d.swim();
		}
		System.out.println("Done processing ducks\n");
	}
	
	public static void main(String[] args) {
		List<Duck> ducks = new LinkedList<Duck>();
		
		Duck myDuck = new RubberDuck();
		
		ducks.add(new MallardDuck());
		ducks.add(new DecoyDuck());
		ducks.add(new RedheadDuck());
		ducks.add(myDuck);
		
		processDucks(ducks);
		
		// change my ducks' behavior dynamically to make a rubber
		// duck that can fly rocket powered and speak
		myDuck.setFlyBehavior(new FlyRocketPowered());
		myDuck.setQuackBehavior(new Speak());
		
		processDucks(ducks);
	}
}
