import java.util.Scanner;

public class Assign5Area {
	int length,breadth;
	int Area;
	int a ;
	int b;
	{
	
	length=a;
	breadth=b;
	}
	
	
	void returnArea(int a,int b){
		Area= a*b;
	System.out.println("Area of rectangle is :" + Area);
	}
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int a,b;
			
			
			System.out.println("Enter length :");
			a =  sc.nextInt();
			
			System.out.println("Enter breadth :");
			b = sc.nextInt();
			
		Assign5Area A1 = new Assign5Area();
		
		A1.returnArea(a,b);
	
}
	}
