package Exception;

public class nullExceptionSample {
	 String s= null;
  public void display() {
	  try {	 
	  System.out.println(s.length());
	  }
	  catch (Exception e){
			
			System.out.println("exception Handled");
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
	}

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nullExceptionSample obj = new nullExceptionSample();
		 System.out.println("end of statement");
			obj.display();
	}

}
