public class Wombat extends Animal {
	
	public Wombat() {
		super();
		name = "Anonymus Wombat";
	}
	
	public Wombat(int weight, String name) {
		super(weight, name);
	}
	
	public void eat(int food) {
		System.out.println("Wombats don't gain weight when they eay!");
	}
	
}