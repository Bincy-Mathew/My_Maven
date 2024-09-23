package encapsulation;

public class EncapsulatedClass {
       private String username;
       private int age;
    // to access this variables need to use the setter method.   
      public void setter(String username,int age) {
    	  this.username =username;
    	  this.age = age;
      }
    	 //To print  the values in the variable need to use public getter.
     public void getter() {
    	 System.out.println(" The username is:" +username);
    	 System.out.println("The age is :"  +age);
     }
      
       
}
