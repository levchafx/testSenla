package task6;

public class Runner {

	public static void main(String[] args) {
		int numberOfItems = 5;
		int capacity = 20;
		int[] weights = new int[numberOfItems + 1];
		for (int i = 1; i < weights.length; i++) {
			weights[i] = (int) (Math.random() * 10);
			System.out.println("Item " + i + " weight = " + weights[i]);
		}
		System.out.println();
		int[] values = new int[weights.length];
		for (int j = 1; j < values.length; j++) {
			values[j] = (int) (Math.random() * 10);
			System.out.println("Item " + j + " value = " + values[j]);
		}
		System.out.println();
		BackPack bp = new BackPack(numberOfItems, capacity, weights, values);
		bp.solve();
		bp.showResult();
	}
}
