package softwareengineering;

import java.util.Scanner;

public class Testproduct {

	public static void main(String[] args)
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the product details");
		int productid= sc.nextInt();
		String name=sc.next();
		int modelnumber= sc.nextInt();
		int quantity=sc.nextInt();
		Product c3 = new Product();
		c3.showinformation(productid, name, modelnumber, quantity);
		 
		}
	

		}

	
