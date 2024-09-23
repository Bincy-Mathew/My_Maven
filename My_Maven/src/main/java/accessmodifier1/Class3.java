package accessmodifier1;

import accessModifiers.Class1;
import accessModifiers.Class2;

public class Class3 {
public void display2() {
	System.out.println("Method outside the package");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Class2 ob=new Class2();
    ob.display();
    
    Class1 obj=new Class1();
   //obj.privateMethod(); not visible for outside the Package.
   // obj.result(); Not accessible for outside the package.
    //obj.reply();Not accessible for outside the package.
    
	}

}
