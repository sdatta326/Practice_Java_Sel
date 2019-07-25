package AA;

import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("ram");
        names.add("ravi");
        names.add("mahesh");
        names.add("suresh");
        
        //foreach loop
        for(String name : names) {
            System.out.println(name);
        }
        
        ArrayList<Integer> i = new ArrayList<Integer>();
        i.add(100);
        i.add(200);
        i.add(300);
        
        for(int num : i) {
            System.out.println(num);
        }
        
    }
}