package abstraction;

public class SampleStudentClass extends StudentAbstractClass{
	public void print() {
		System.out.println("Abstract method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleStudentClass obj = new SampleStudentClass();
		//obj.StudentAbstractClass();
		obj.print();
		obj.result();
		obj.showDetails("Mary", "twenty", "FSC");
		
		
		}

}
