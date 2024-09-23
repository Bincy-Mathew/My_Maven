package accessModifiers;

public class Class2 {
   public void display() {
	System.out.println("Method in Class2");   
	   
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Class1 ob=new Class1();
    ob.print1();
   // ob.privateMethod();  Not visible in different class in same package.
    ob.result();//visible in different class-Protected.
    ob.reply();//visible in different class-default.
	}

}
