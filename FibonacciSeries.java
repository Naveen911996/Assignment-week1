package week1.Assignment1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range=8;
int a=0,b=1,sum;
		
		System.out.println(a);
		for (int i = 1; i < range; i++) {
			
			sum=a+b;
			
			a=b;
			b=sum;
			System.out.println(sum);
			
		}
	}

}
