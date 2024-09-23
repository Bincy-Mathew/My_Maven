package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SampleListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List la= new ArrayList();
		la.add("Good");
		la.add(3);
		la.add("Morning");
		la.add(809.0f);
		System.out.println(la);
		
		List<String> lis = new ArrayList();
		lis.add("Great");
		lis.add("Indian");
		lis.add("Maha");
		lis.add("Sale");
	      System.out.println(lis);
	    lis.remove(2);
	      System.out.println(lis);
		
		
	     List<String> lit =new ArrayList();
	     lit.add("Amazon");
	     lit.add("India");
	     lit.addAll(lis);
	      System.out.println(lit);
	      lit.removeAll(lit);
	      System.out.println(lit);
	      
	      
	      System.out.println(lis.get(1));
	      System.out.println(lis.size());
	      
	      boolean a= lis.contains("Friends");
	      System.out.println(a);
	      boolean f= lis.contains("Indian");
	      System.out.println(f);
	      
	      
	      Iterator ta = la.iterator();
	      while(ta.hasNext()) 
	      {
	    	  	    	  
	    	  System.out.println(ta.next());
	      } 
	       ta.remove();
	       System.out.println(la);
	      
	}
	}
	
	
	


