package AA;

import java.util.*;

import java.util.Scanner;

public class TestShapeService{

public static void main(String[] args) {
int op;
Scanner sc= new Scanner(System.in);
System.out.println("Which area you want to know?: For Rectangle press 1,For Circle press 2,For Triangle press 3");
op=sc.nextInt();
System.out.println("I want to know the Area of"+ op);
if (op==1) {
System.out.println(ShapeService.area(10,20));
}
else if (op==2) {
System.out.println(ShapeService.area(20));
}
else if (op==3) {
System.out.println(ShapeService.area(10,20,30));
}
else {
System.out.println("Please enter correct input");
}
}
}