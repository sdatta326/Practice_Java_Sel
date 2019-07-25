package BB;

//import AA.*;



public class a extends AA.a {//if u use fully qualified path den u dont need to import packages keyword

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AA.a o1=new AA.a();
System.out.println("second package"+i);
	}

}


//you can create same name class in different packages but not in same packages
//create same name class in two different packages and then import all classes of first package 
//into second package but only class names and packages names have come not their properties and methods
//to access properties and modify the functionality changes of parent class u have to use inheritance
//or if u dont want to use inheritance u have to create object of parent class under main method or any other calss inside
//u have to create object of parent class then u can access it,to execute from main method u then create object of the subclass or 
//or the class where u have created parent object and then print those// otherwise method is inheritance to access properties 
//of parent class first extend parent class with child class then create object of child class and access parent class properties as now all
//properties of parent class has come down to child class//only one public class should be there per program// to access same name class from another
//package same name class extends full package name.class name
//If you use packagename.*, then all the classes and interfaces of this package will be accessible but the classes and interface inside the subpackages will not be available for use.
