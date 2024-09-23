package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al = new ArrayList();// Non generic arrayList
     al.add("Hello");
     al.add(0.45f);
     al.add(10);
     al.add('f');
     System.out.println(al);
     
     
     
     ArrayList<String>s = new ArrayList();// generic ArrayList
     s.add("Java");// add() for adding elements in arrayList
     s.add("Hi");
     s.add("HLO");
     s.add("World");
     System.out.println(s);
     s.remove(1);// For removing elements based on index from ArrayList
     System.out.println(s);
     
     
     
     
     ArrayList<String>b = new ArrayList();
     b.add("Bincy");
     b.add("Mathew");
     b.addAll(s);// for adding these elements in another arrayList
     System.out.println(b);
     b.removeAll(b);//for completely removing these elements
     System.out.println(b);
     
     System.out.println(s.get(2));//for getting the particular elements based on its index
     System.out.println(s.size());//for getting size of the ArrayList
     
     boolean d = s.contains("HLO");// for checking the specific element that user given is present or not in the ArrayList
     System.out.println(d);
     
     boolean f = s.contains("hoi");
     System.out.println(f);
     
     Iterator it = al.iterator();//iterator Interface
     while(it.hasNext())
     {
    	 System.out.println(it.next());
    	 
     }
     it.remove();//for removing last index elements
     System.out.println(al);
     
     
	}

}
