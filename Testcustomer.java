package softwareengineering;

import java.util.Scanner;

import democlass2.Constaccount;
import democlass2.Constructordata;
import democlass2.Customer;

public class Testcustomer {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the customer details");
		   int id= sc.nextInt();
		   String name=sc.next();
		String email= sc.next();
		String address=sc.next();
		int contactno=sc.nextInt();
		     Customer c1 = new Customer();
		     c1.Showdetails(id,name,email,address,contactno);

		}

		}

	
