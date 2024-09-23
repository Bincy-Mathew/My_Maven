package Exception;

public class exceptionSample {
	public void display() {
		int a=10;
		int b=a/0;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionSample obj = new exceptionSample();
        System.out.println("end of statement");

		obj.display();
        System.out.println("end of statement");
	}

}
