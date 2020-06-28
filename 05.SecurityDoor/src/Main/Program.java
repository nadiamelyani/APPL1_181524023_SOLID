package Main;

import Model.*;
import Model.SecurityManager;

public class Program {

	public static void main(String[] args) {
		
		ScannerUI scannerUi = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUi);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUi);
        SecurityManager manager = new SecurityManager(keyCardCheck, pinCodeCheck);
        manager.Check();
	}
}
