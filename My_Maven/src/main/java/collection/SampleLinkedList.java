package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList lt = new LinkedList();
      lt.add("HI");
      lt.add("Doggy");
      lt.add(89);
      lt.add(900.0f);
      System.out.println(lt);
      
      
      LinkedList<String> ls =new LinkedList();
      ls.add("Big");
      ls.add("Billion");
      ls.add("Days");
      ls.add("FlipKart");
      System.out.println(ls);
      ls.remove(2);
      System.out.println(ls);
      
      
      LinkedList<String> ll =new LinkedList();
      ll.add("Dhoom");
      ll.add("Dhamakka");
      ll.addAll(ls);
      System.out.println(ll);
      ll.removeAll(ll);
      System.out.println(ll);
      
      
      
      System.out.println(ls.get(2));
      System.out.println(ls.size());
      
      boolean b= ls.contains("Friends");
      System.out.println(b);
      boolean c= ls.contains("Big");
      System.out.println(c);
      
      
      Iterator it = lt.iterator();
      while(it.hasNext()) {
    	  System.out.println(it.next());
    	  
      it.remove();
      System.out.println(lt);
      }
      
      
	}
	

}
