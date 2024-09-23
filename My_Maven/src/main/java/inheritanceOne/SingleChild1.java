package inheritanceOne;

public class SingleChild1 extends SingleParent1 {
	public void print() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleChild1 obj= new SingleChild1();
		obj.display();
		obj.print();
		System.out.println(obj.Age);
		System.out.println(obj.name);
		
	}

}
