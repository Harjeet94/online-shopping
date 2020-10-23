package softwareengineering;

import java.util.Scanner;

public class Testpayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the payment details");
		int paymentid= sc.nextInt();
		String paymentmethod=sc.next();
		Payment b1 = new Payment();
		b1.display(paymentid, paymentmethod);

		}

		}


