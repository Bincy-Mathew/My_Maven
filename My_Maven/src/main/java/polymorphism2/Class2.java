package polymorphism2;

public class Class2 extends Class1{

	public void info(String CollegeName, int year, String dept, String HOD) {
		
		System.out.println("Student details : "+CollegeName+ "  " +year +"  " +dept+"  "+HOD+" ");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 cs= new Class2();
		cs.info("College name :-St.Antony College", 2024, " Dept:- Bsc.Fsc", "HOD:-Mohan");
		
		
	}

}
