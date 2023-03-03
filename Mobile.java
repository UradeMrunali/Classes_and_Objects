import java.util.Scanner;

public class Mobile 
 {
	 String brand_name;
	 String m_name;
	 String color;
	 int m_no ;
	 double price;
	 boolean stock;
	
	 
 
	 
 
 void setData()
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter Brand Name");
	 brand_name = sc.nextLine();
	 
	 System.out.println("Enter Mobile Name");
	 m_name = sc.nextLine();
	 
	 System.out.println("Enter Color");
	 color = sc.nextLine();
	 
	 System.out.println("Enter Model Number");
     m_no =Integer.parseInt( sc.nextLine());
     
     System.out.println("Enter Price");
     price = Double.parseDouble(sc.nextLine());
     

 
 
 
 }
 
 
 void showData()
 {
	 
	 System.out.println( brand_name+ " "+m_name+" "+color+" "+m_no+  " "+ price);
	 System.out.println(stock);
 }
 
 
  public static void main(String[] args)
  
  {
	  Mobile m1 = new Mobile();
	 // Mobile m2 = new Mobile();
	  
	  
	  m1.setData();
	 // m2.setData(); 
	  
	  m1.showData();
	//  m2.showData();
	
}
 }
  
















 