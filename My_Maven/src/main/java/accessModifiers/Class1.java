package accessModifiers;

public class Class1 {
	public void print1()
	{
		System.out.println("Public method");
	}

	private void privateMethod() {
		
		System.out.println(" Within class method in Private method");
	}
	protected void result() {
		System.out.println("protected within a class");
		
	}
	void reply() {
		System.out.println("Default within a class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Class1 obj = new Class1();
    obj.print1();
    obj.privateMethod();
    obj.result();// accessible in same class.
    obj.reply();// Accessible within a class.
    
	}

}
