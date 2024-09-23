package Inheritance;

public class SingleChild  extends SingleParent{
 public void print(){
	 System.out.println("Child class");
 }
	public static void main(String[] args) {
		
		SingleChild obj=new SingleChild();
		obj.print();
		obj.display();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
