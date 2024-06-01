import java.util.ArrayList;

public class Brilliants {
	ArrayList<Integer> brilliants = new ArrayList<Integer>();
	
	public Brilliants(int n) {
		buildBrilliants(n);
	}

	private void buildBrilliants(int n) {
		int counter = 0;
		for (int i = 2; counter < n; i++) {
			if (Main.isBrilliant(i)) {
				brilliants.add(0, i);
				counter++;
			}
		}
	}
	
	public ArrayList<Integer> getBrilliants() {
		return brilliants;
	}
	
}
