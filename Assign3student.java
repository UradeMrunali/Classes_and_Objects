import java.util.Scanner;

public class Assign3student {

	
	int roll_no;
	int ph_no;
	String add;
	
	Scanner sc = new Scanner(System.in);
	
	void showData(){
		
		System.out.println("Enter address :");
		add = sc.nextLine();
		
		System.out.println(" Enter roll no. ");
		roll_no = sc.nextInt();
		
		System.out.println("Enter ph no. ");
		ph_no = sc.nextInt();
		
		//System.out.println("Enter address :");
		//add = sc.nextLine();
	}
	
	public static void main(String[] args) {
		
		Assign3student s1 = new Assign3student();
		Assign3student s2 = new Assign3student();
		
		s1.showData();
		s2.showData();
	}
}
