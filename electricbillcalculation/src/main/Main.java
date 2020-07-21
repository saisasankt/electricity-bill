package main;

import service.ConnectionService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				ConnectionService cs = new ConnectionService();
				
				// Domestic Testing
				
				System.out.println(cs.generateBill(130, 120, "Domestic"));
				//Output bust be 23.0
				
				System.out.println(cs.generateBill(180, 120, "Domestic"));
				//Output bust be 157.0
				
				System.out.println(cs.generateBill(280, 120, "Domestic"));
				//Output bust be 655.0
				
				System.out.println(cs.generateBill(-280, 120, "Domestic"));
				//Output bust be Incorrect Reading
				
				System.out.println(cs.generateBill(280, -120, "Domestic"));
				//Output bust be Incorrect Reading
				
				System.out.println(cs.generateBill(100, 120, "Domestic"));
				//Output bust be Incorrect Reading
				
				System.out.println(cs.generateBill(200, 120, "domestic"));
				//Output bust be Invalid ConnectionType
				
				System.out.println(cs.generateBill(200, 120, "dom"));
				//Output bust be Invalid ConnectionType
				
				 
				//Commercial Testing
				
				
				System.out.println(cs.generateBill(130, 120, "Commercial"));
				//Output bust be 53.04
				
				System.out.println(cs.generateBill(180, 120, "Commercial"));
				//Output bust be 334.56
				
				System.out.println(cs.generateBill(280, 120, "Commercial"));
				//Output bust be 1119.96
				
				System.out.println(cs.generateBill(-280, 120, "Commercial"));
				//Output bust be Incorrect Reading
				
				System.out.println(cs.generateBill(280, -120, "Commercial"));
				//Output bust be Incorrect Reading
				
				System.out.println(cs.generateBill(100, 120, "Commercial"));
				//Output bust be Incorrect Reading
				
				System.out.println(cs.generateBill(200, 120, "commercial"));
				//Output bust be Invalid ConnectionType
				
				System.out.println(cs.generateBill(200, 120, "comm"));
				//Output bust be Invalid ConnectionType
						


	}

}
