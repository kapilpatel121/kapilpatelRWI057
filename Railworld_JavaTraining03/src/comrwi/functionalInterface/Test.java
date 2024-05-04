package comrwi.functionalInterface;

public class Test {
	public static void main(String[] args) {
		Interf f = (a, b) -> a + b;

		int sum = f.add(10, 20);
		System.out.println("Sum is :- " + sum);
	}
}
