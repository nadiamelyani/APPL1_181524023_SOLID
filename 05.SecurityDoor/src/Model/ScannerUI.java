package Model;

import java.util.Scanner;

import Interface.ISecurityUI;

public class ScannerUI implements ISecurityUI {

	public String RequestKeyCard() {
        System.out.println("Slide your key card");
        Scanner scanner = new Scanner(System.in);
        String keycard = scanner.nextLine();
        return keycard;
    }

    public int RequestPinCode() {
    	System.out.println("Enter your pin code:");
        Scanner scanner = new Scanner(System.in);
        int pincode = scanner.nextInt();
        return pincode;
    }
}
