package AA;
import java.util.*;
public class ArrayListExample2 {
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
        
        System.out.println("-------------------");
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Double> sal = new ArrayList<Double>();
        for(int x=0;x<=3;x++) {
            sal.add(sc.nextDouble());
        }
        
        for(double num : sal) {
            System.out.println(num);
        }
        
        System.out.println(names.contains("ravi"));
        System.out.println(names.indexOf("ravi"));
        names.remove("mahesh");
        
        System.out.println("----------------");
        
    

    for(String name : names) {
            System.out.println(name);
        }
        
        System.out.println("-------------------");
    }
}