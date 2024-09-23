package Interface;

public class SampleClass implements Interfacesample1 {
	public void display() {//definition for abstract class
		System.out.println("Abstract method 1");
	}
  public void add() {
	  int c= a+b;
	  System.out.println(c);
  }
   public void print() {
	   System.out.println(" Method in Class");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SampleClass obj = new SampleClass();// object created for class
		obj.display();
		obj.add();
		obj.print();
		System.out.println(obj.a);
		System.out.println(obj.b);*/
		Interfacesample1 ob= new SampleClass();// Object creation for interface.  
		//here we get only the elements inside the interface.
		//So we are creating object with class name.
		ob.display();
		ob.add();
		//ob.print();we will not get the class elements.
		System.out.println(ob.a);
		System.out.println(ob.b);
		
	}

}
