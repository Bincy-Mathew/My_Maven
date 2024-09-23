package Exception;

public class exceptionHandle {

	    
		// TODO Auto-generated method stub
		public void display() {
			try {
			int a=10;
			int b=a/0;
			System.out.println(b);
			}catch(Exception e) {
				
				System.out.println("exception Handled");
				System.out.println(e);
			}
			finally {
				System.out.println("finally block");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			exceptionHandle obj = new exceptionHandle();
	        System.out.println("end of statement");

			obj.display();
	        //System.out.println("end of statement");
		}
	}


