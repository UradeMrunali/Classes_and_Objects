import java.util.Scanner;

public class Assign4Rectangle {
  int l,b;
  int Area;


//  void setArea()
//  {
//	  Scanner sc = new Scanner(System.in);
//	  System.out.println("Enter Length of Rectangle  : ");
//	  l = sc.nextInt();
//	  
//	  System.out.println("Enter Breadth of Rectangle  :");
//      b = sc.nextInt();
//  }
//  
void getArea(int l, int b){
	Area = l*b;
	
	//System.out.println("Area of Rectangle1  is :" + Area1);

	
	System.out.println("Area of Rectangle  is :" + Area);
	
	
	
	
	
	
}

public static void main(String[] args) {
	
	
Assign4Rectangle A1 = new Assign4Rectangle();
Assign4Rectangle A2 = new Assign4Rectangle();
	
	//A1.setArea();
	//A2.setArea();
	
	A1.getArea(4,5);
	A2.getArea(5,8);
}
}

