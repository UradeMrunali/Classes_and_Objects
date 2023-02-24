import java.util.Scanner;

public class Assign1area {
	int length,breadth ;
	
	
   void setDim()
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter length of rectangle : ");
	length = sc.nextInt();
	
	System.out.println("Enter breadth of rectangle : ");
	breadth = sc.nextInt();
	   

}
   
   void getArea(){
	   int area = length*breadth;
	   
	   System.out.println("Area of Rectangle is : " + area);
	   
   }
   
   
   public static void main(String[] args) {
	 
	   
	   Assign1area a1= new Assign1area();
	   
	   a1.setDim();
	   
	   a1.getArea();
}
}