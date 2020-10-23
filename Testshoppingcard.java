package softwareengineering;

import java.util.Scanner;

public class Testshoppingcard {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the shopping details");
		int shoppingcard= sc.nextInt();
		int productid = sc.nextInt();
		Shoppingcard s4= new Shoppingcard();
		s4.showingdetails(shoppingcard, productid);


		}

		}


	
