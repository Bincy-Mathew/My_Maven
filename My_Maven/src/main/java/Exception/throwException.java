package Exception;

public class throwException {
	public static void display( int age) {
		if (age< 18) {
			throw new ArithmeticException ("Not Eligible");// we throw the exception to the constructor
		}
		else {
			System.out.println("Eligible for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwException.display(16);
		System.out.println("Print the result");
	}

}
