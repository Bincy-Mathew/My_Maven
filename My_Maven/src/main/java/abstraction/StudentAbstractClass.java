package abstraction;

public abstract class StudentAbstractClass {
public abstract void print();
/*public StudentAbstractClass() {
	System.out.println("Student details" );
}*/
public  void result() {
	System.out.println("Static method in abstract class");
	
}
public void showDetails( String name, String age, String course) {
	System.out.println("Name :" + name);
	System.out.println("Age :" +age);
	System.out.println("Course:" +course);
	
}
}
