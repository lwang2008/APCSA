import java.util.ArrayList;

public class Primes {
	ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public Primes(int n) {
		buildPrimes(n);
	}

	private void buildPrimes(int n) {
		int counter = 0;
		for (int i = 2; counter < n; i++) {
			if (Main.isPrime(i)) {
				primes.add(0, i);
				counter++;
			}
		}
	}
	
	public ArrayList<Integer> getPrimes() {
		return primes;
	}
	
}
