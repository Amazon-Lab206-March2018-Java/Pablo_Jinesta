package com.esppablo.phone;

public class PhoneTester {
	
	// Implement the overriden methods (ring, unlock, displayInfo) from the IPhone and Galaxy classes according to the PhoneTester file below:

	public static void main(String[] args) {
		
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iphone10 = new IPhone("X", 100, "AT&T", "Zing");
		
		// Galaxy Test
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		System.out.println("\n#######################\n");
		
		// iPhone Test
		iphone10.displayInfo();
		System.out.println(iphone10.ring());
		System.out.println(iphone10.unlock());		

	}

}
