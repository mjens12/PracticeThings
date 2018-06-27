package bigOhLab;

public class CountIt3 {
	public long SnippetLog(long n) {
		long i, j, x = 0;

		i = 1;
		x++;
		while (i < n) {
			x++;
			x++; // SomeStatement
			i = i * 2;
			x++;
		}
		x++; // Can you explain why is this here?
		return x;
	}

	public static void main(String[] args) {
		CountIt3 r = new CountIt3();
		Long t = System.currentTimeMillis();
		System.out.println(r.SnippetLog(1000000000));
		System.out.println("Time:" + (System.currentTimeMillis() - t));
	}
}
