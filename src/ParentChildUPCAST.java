    class Parentclass{
    int x=5;
    void show(){
    System.out.println("parent");
    }
     
    void ShowP(){
    System.out.println("Parent-Show");
    }
    }
     
    class Child extends Parentclass{
    int x=10;
    void show(){
    System.out.println("child");
    }
    void ShowC(){
    System.out.println("Child-Show");
    }
    }
     
    public class ParentChildUPCAST {
    public static void main(String[] args) {
    	Parentclass p = new Child();
    p.show();
    p.ShowP();
    System.out.println(p.x);
    }
    }