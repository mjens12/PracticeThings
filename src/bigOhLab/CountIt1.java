package bigOhLab;

public class CountIt1 {
	public int linearLoop(int N) {

		int x = 0;
		x++;
		int count = 0;
		x++;
		while (count < N) {
			x++;
			System.out.println(".");
			x++;
			count++;
		}
		return x;
	}

	public static void main(String[] args) {
		CountIt1 ex = new CountIt1();
		int N = 1000000000;
		long start = System.currentTimeMillis();
		ex.linearLoop(N);
		Long endTime = System.currentTimeMillis();
		System.out.println(
				"\nN = " + N + ". Loops ran in: " + (endTime - start));
	}
}