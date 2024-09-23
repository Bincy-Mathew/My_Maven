package accessmodifier1;

import accessModifiers.Class1;

public class Class4 extends Class1{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Class4 obj = new Class4();
    obj.print1();
   //obj.privateMethod(); not visible in outside pacakage by sub class.
    obj.result();
    //obj.reply();
	}

}
