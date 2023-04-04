import java.util.Scanner;

public class Area {

	int no_of_family;
	String family_name;
	String head;
	int no_of_members;
	int no_of_children;
	int no_of_ladies;


 void setData()
    {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter no of Family");
	 no_of_family = Integer.parseInt(sc.nextLine());
	 
	 System.out.println("Enter no of members");
	 no_of_members = Integer.parseInt(sc.nextLine());
	
	 System.out.println("Enter head of Family ");
	 head = sc.nextLine();
	 
	 System.out.println("Enter no of children ");
	 no_of_children = Integer.parseInt(sc.nextLine());
	 
	 System.out.println("Enter no of ladies");
	 no_of_ladies = Integer.parseInt(sc.nextLine());
	 
	 System.out.println("Enter Family name");
	 family_name = sc.nextLine();	 
  }
 
 void getData()
 {
	 System.out.println(no_of_family+" "+no_of_members+" "+head.toUpperCase()+" "+no_of_children+" "+no_of_ladies+" "+family_name.toUpperCase());
 }
 public static void main(String[] args) {
		
	Area h1 = new Area();
		
	h1.setData();
	h1.getData();

	}
    }
