package Model;

import Interface.ISecurityUI;

public class KeyCardCheck extends SecurityCheck {

	private ISecurityUI securityUI;
	
	public KeyCardCheck(ISecurityUI securityUI) {
		this.securityUI = securityUI;
	}
	
	private boolean isValid(String code) {
		return true;
	}
	
	public boolean ValidateUser() {
		String code = securityUI.RequestKeyCard();
        if(isValid(code)) {
            return true;
        }
        return false;
	}
}
