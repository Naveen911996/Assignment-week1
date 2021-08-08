package week1.Assignment1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 153;
		int calculated = 0, remainder = 0, original;
		original = i;
		while (original > 0) {
			remainder = original % 10;
			original = original / 10;
			calculated = calculated + (remainder * remainder * remainder);
		}
		System.out.println(i);
		System.out.println(calculated);
		if (calculated == i) {
			System.out.println("given number is a armstrong number");
		} else {
			System.out.println("givan number is not an armstrong number");
		}
	}
}
