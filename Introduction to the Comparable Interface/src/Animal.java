public class Animal  implements Comparable<Animal> {
	
	int weight;
	String name;
	
	public Animal() {
		weight = 1800;
		name = "Anonymus Animal";
	}
	
	public Animal(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public int getWeight() {return weight;}
	public String getName() {return name;}
	public void eat(int food) {weight = weight + food;}
	
	public int compareTo(Animal o) {
		if (weight > o.getWeight()) {
			return 1;
		} else if (weight < o.getWeight()) {
			return -1;
		} return 0;
	}
	
}
