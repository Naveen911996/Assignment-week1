package week1.Assignment1;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number = 345;
		int Sum = 0, Reminder = 0;
		while(Number > 0) {
			
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
System.out.println(Sum);
	}

}
