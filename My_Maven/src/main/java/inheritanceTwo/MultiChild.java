package inheritanceTwo;

public class MultiChild extends MultiParent{
	public void show() {
		int a= 20;
		int b= 10;
		int multi= a*b;
		System.out.println(" youe answer is :" +multi);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiChild obj = new MultiChild();
		obj.display();
		obj.print();
		obj.show();
		
		
	}

}
