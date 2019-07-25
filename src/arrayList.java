import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> names=new ArrayList<String>();
names.add("ram");
names.add("sham");
names.add(2,"bam");
names.add("kham");
names.set(2,"element");
names.remove(3);
//names.clear();
System.out.println(names.isEmpty());
System.out.println(names.size());
System.out.println(names.indexOf("ram"));
System.out.println(names.contains("sham"));
Collections.sort(names);//sorting in ascending order

for(String i:names)
{
	System.out.println(i);
}
	}

}
//java collection arraylist

