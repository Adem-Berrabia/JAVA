package ex1;
import java.util.ArrayList;
import java.util.Vector;
public class ex1 {
public static void main(String args[]) {
	Vector vec = new Vector();
	for(int i=0;i<10;i++) {
		Integer element = new Integer(i);
		vec.addElement(element);
		System.out.println(vec);
	}
	String l = "java";
	vec.insertElementAt(l, 5);
	System.out.println(vec);
	System.out.println(vec.elementAt(2));
	String s = "cours";
	vec.setElementAt(s, 3);
	System.out.println(vec);
	if(vec.contains(s)) {
		System.out.println(s+" existe dans vector");
	}
	System.out.println(vec.indexOf(s));
	System.out.println(vec.size());
	vec.removeElement(3);
	System.out.println(vec);
	ArrayList list = new ArrayList();
	list.add("un");
	list.add("deux");
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.isEmpty());
	
}
}
