package practice;

public class Recursion {
	public int powerN(int base, int n) {
		if (n == 0 || base == 1) {
			return 1;
		}

		if (base == 0 && n == 0)
			throw new RuntimeException();

		if (n < 0) {
			return 1 / (base * powerN(base, Math.abs(n + 1)));
		}
		return base * powerN(base, n - 1);
	}
}