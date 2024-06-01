public class Main {

	public static void main(String[] args) {
		Primes FIFTY_PRIMES = new Primes(50);
		System.out.println(FIFTY_PRIMES.getPrimes());
		Brilliants TWENTY_BRILLIANTS = new Brilliants(20);
		System.out.println(TWENTY_BRILLIANTS.getBrilliants());
	}

	public static boolean isPrime(int n) {
		if (n == 1) return false;
		for (int factor = 2; factor <= Math.sqrt(n); factor++) {
			if ((n % factor)== 0) {
				return false;
			}
		} return true;
	}
	
	public static boolean isBrilliant(int n) {
		for (int factor = 2; factor <= Math.sqrt(n); factor++) {
			if ((n % factor) == 0) {
				int otherFactor = n / factor;
				if (isPrime (otherFactor)) {
					return sameDigits(factor, otherFactor);
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	private static boolean sameDigits(int f, int o) {
		return numOfDigits(f) == numOfDigits(o);
	}
	
	private static int numOfDigits(int n) {
		int digits;
		for (digits = 1; Math.pow(10, digits) <= n; digits++);
		return digits;
	}
}