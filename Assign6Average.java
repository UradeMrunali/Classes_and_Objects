import java.util.Scanner;

public class Assign6Average {
	
	int num1,num2,num3;
	int Average;
	
	void calculateAverage(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 3 numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
	}
	
	void printAverage(){
		
		Average = (num1 + num2 + num3) / 3;
		
		System.out.println("Average of these no. is :"+ Average);
}
	
	public static void main(String[] args) {
		
		Assign6Average A = new Assign6Average();
		
		A.calculateAverage();
		A.printAverage();
	}
}
