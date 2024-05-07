package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Colors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>color=new ArrayList<String>();
		color.add("Violet");
		color.add("Indigo");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("Red");
		System.out.println(color);
		
		System.out.println();
		
		System.out.println("Retrieve an element at index 5 : "+color.get(5));
		
		System.out.println();
		
		System.out.println("To Iterate all elements in ArrayList : ");
		Iterator<String> i=color.iterator();		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		
		System.out.println("After Removing the third element : "+color.remove(2));
		System.out.println(color);
		
		System.out.println();
		
		System.out.println("To search an element : ");
		boolean x=color.contains("Green");		
		System.out.println(x+" Green is found..");
		
		System.out.println();
		boolean y=color.contains("Purple");		
		System.out.println(y+" Purple is not found..");
	}

}
