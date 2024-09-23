package abstraction;

public class SampleClass extends AbstractClass {// should extend with abstract class.
	public void print() {
		System.out.println("Abstract method");//giving definition for abstract method by giving same method name as abstract method name.
	}
	public void show() {
		System.out.println("Normal method in sample class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    SampleClass obj= new SampleClass();
    obj.print();
    obj.display();
    obj.show();
	}

}
