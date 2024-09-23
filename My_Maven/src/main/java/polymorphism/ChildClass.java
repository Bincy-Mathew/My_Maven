package polymorphism;

public class ChildClass extends ParentClass {
 @Override
	public void display() {
	 System.out.println("Child Class");
	 //super.display();
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj= new ChildClass();
		obj.display();
		ParentClass ob=new ParentClass();
		ob.display();
		
	}

}
