package week1.Assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 13;
		Boolean flag = false;
		for (int i = 2; i < input / 2; i++) {
			int remainder = input % i;
			if (remainder == 0) {
				flag = true;
				break;
			}
		}
		if (flag != true) {
System.out.println("given number " + input + " is a prime number");
		}
		else
		{
			System.out.println("given number " + input + " is not a prime number");
		}
	}

}
