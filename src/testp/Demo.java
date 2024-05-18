package testp;
import java.util.ArrayList;
//add
//size
//contains
//isempty

public class Demo {
public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	ArrayList<Comparable> l=new ArrayList();
	System.out.println("size"+l.size());
	l.add(20);
	l.add("omprakash");
	l.add(4.3f);
	l.add(8);
	l.add('r');
	System.out.println("size"+l.size());
	System.out.println(l.contains(55));
	System.out.println(l.isEmpty());
	System.out.println(l.get(1));
	System.out.println(l.remove(4));
	System.out.println("size"+l.size());
	System.out.println(l);
	
}
}
